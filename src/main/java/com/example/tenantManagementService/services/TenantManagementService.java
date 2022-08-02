package com.example.tenantManagementService.services;

public interface TenantManagementService {
    void createTenant(String tenantId, String db, String password) throws Exception;
}
