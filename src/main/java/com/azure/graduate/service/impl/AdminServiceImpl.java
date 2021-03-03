package com.azure.graduate.service.impl;

import com.azure.graduate.common.entity.AdminLoginEntity;
import com.azure.graduate.db.example.SystemAdminExample;
import com.azure.graduate.db.mapper.SystemAdminMapper;
import com.azure.graduate.db.model.SystemAdmin;
import com.azure.graduate.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private SystemAdminMapper adminMapper;

    @Override
    public SystemAdmin adminLogin(AdminLoginEntity adminLoginEntity) {
        SystemAdminExample systemAdminExample = new SystemAdminExample().or()
                .andAdminAccountEqualTo(adminLoginEntity.getAdminAccount())
                .andAdminPasswordEqualTo(adminLoginEntity.getAdminPassword())
                .example();
        logger.info("account：{}, password：{}", adminLoginEntity.getAdminAccount(), adminLoginEntity.getAdminPassword());

        SystemAdmin admin = adminMapper.selectOneByExample(systemAdminExample);

        logger.info("info:{}", admin);
        return admin;
    }
}
