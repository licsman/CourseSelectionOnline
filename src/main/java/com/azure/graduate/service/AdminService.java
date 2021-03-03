package com.azure.graduate.service;

import com.azure.graduate.common.entity.AdminLoginEntity;
import com.azure.graduate.db.model.SystemAdmin;

public interface AdminService {
    SystemAdmin adminLogin (AdminLoginEntity adminLoginEntity);
}
