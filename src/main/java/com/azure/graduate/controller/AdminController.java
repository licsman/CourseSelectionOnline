package com.azure.graduate.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "AdminController", tags = "Restful api to query/get/create/delete teacher")
@RestController("AdminController")
@RequestMapping("/api/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @ApiOperation(value = "administrator login")
    @GetMapping
    public String adminLogin() {
        return "success";
    }
}
