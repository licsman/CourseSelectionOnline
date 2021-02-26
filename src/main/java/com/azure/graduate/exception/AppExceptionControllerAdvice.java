package com.azure.graduate.exception;

import com.azure.graduate.annotation.AppExceptionCode;
import com.azure.graduate.response.AppResponseBody;
import com.azure.graduate.response.AppResponseStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;

@RestControllerAdvice(basePackages = {"com.azure.graduate.controller"})
public class AppExceptionControllerAdvice {
    @ExceptionHandler(AppExceptionBody.class)
    public AppResponseBody<String> APIExceptionHandler(AppExceptionBody e) {
        return new AppResponseBody<>(AppResponseStatus.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public AppResponseBody<String> ArgsValid(MethodArgumentNotValidException e) throws NoSuchFieldException {
        //从异常对象中拿到错误信息
        String defaultMessage = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();

        //参数的Class对象，准备通过字段名称获取Field对象
        Class<?> parameterType = e.getParameter().getParameterType();
        String fieldName = e.getBindingResult().getFieldError().getField();
        Field field = parameterType.getDeclaredField(fieldName);

        //获取Field字段上的自定义注解
        AppExceptionCode annotation = field.getAnnotation(AppExceptionCode.class);

        // 有注解的话就返回注解的响应信息
        if (annotation != null) {
            return new AppResponseBody<>(annotation.appError().getCode(), annotation.appError().getMsg() ,defaultMessage);
        }

        // 如果字段没有自定义注解就直接提取错误提示信息进行返回
        return new AppResponseBody<>(AppResponseStatus.VALIDATE_FAILED, defaultMessage);
    }
}