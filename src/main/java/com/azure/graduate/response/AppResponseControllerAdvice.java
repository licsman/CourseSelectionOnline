package com.azure.graduate.response;

import com.azure.graduate.annotation.NoResponseBody;
import com.azure.graduate.exception.AppExceptionBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(basePackages = "com.azure.graduate.controller")
public class AppResponseControllerAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class aClass) {
        // 如果接口返回的类型本身就是OgResult那就没有必要进行额外的操作，返回false
        // 如果包含NoResponseBody注解，就直接返回，不做包装
        return !(returnType.getParameterType().equals(AppResponseBody.class) || returnType.hasMethodAnnotation(NoResponseBody.class));
    }

    @Override
    public Object beforeBodyWrite(Object data, MethodParameter returnType, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        // String类型不能直接包装，所以要进行些特别的处理
        if (returnType.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // 将数据包装在OgResult里后，再转换为json字符串响应给前端
                return objectMapper.writeValueAsString(new AppResponseBody<>(data));
            } catch (JsonProcessingException e) {
                throw new AppExceptionBody("返回String类型错误");
            }
        }
        // 将原本的数据包装在OgResult里
        return new AppResponseBody<>(data);
    }
}
