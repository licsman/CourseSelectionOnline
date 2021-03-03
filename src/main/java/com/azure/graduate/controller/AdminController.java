package com.azure.graduate.controller;

import com.azure.graduate.common.entity.AdminLoginEntity;
import com.azure.graduate.db.model.SystemAdmin;
import com.azure.graduate.response.AppResponseBody;
import com.azure.graduate.response.AppResponseStatus;
import com.azure.graduate.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Api(value = "AdminController", tags = "Restful api administrator login module")
@RestController("AdminController")
@RequestMapping("/api/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "administrator login")
    @PostMapping("/login")
    public AppResponseBody<String> adminLogin(@RequestBody AdminLoginEntity adminLoginEntity, HttpSession httpSession) {
        SystemAdmin admin = adminService.adminLogin(adminLoginEntity);
        logger.info("Http Session中的内容admin：{}", httpSession.getAttribute("admin"));
        if (admin != null) {
            if (httpSession.isNew()) {
                httpSession.setAttribute("admin", admin);
                return new AppResponseBody<>(AppResponseStatus.SUCCESS, "首次登陆：success");
            } else {
                return new AppResponseBody<>(AppResponseStatus.SUCCESS, "欢迎回来：success");
            }
        }
        return new AppResponseBody<>(AppResponseStatus.FAILED, "首次登陆：failed,用户名或密码错误");
    }

    @ApiOperation(value = "administrator exit login")
    @PostMapping("/exit")
    public AppResponseBody<String> adminExitLogin(HttpSession httpSession) {
        httpSession.invalidate();
        return new AppResponseBody<>(AppResponseStatus.SUCCESS, "退出登陆并清除session");
    }
}
