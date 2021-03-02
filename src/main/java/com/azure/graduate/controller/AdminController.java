package com.azure.graduate.controller;

import com.azure.graduate.common.entity.AdminLoginEntity;
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

@Api(value = "AdminController", tags = "Restful api administrator login module")
@RestController("AdminController")
@RequestMapping("/api/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "administrator login")
    @PostMapping("/login")
    public String adminLogin(@RequestBody AdminLoginEntity adminLoginEntity) {
        return adminService.adminLogin(adminLoginEntity);
    }
}
