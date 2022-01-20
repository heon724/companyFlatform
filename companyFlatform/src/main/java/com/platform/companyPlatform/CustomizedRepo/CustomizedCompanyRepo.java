package com.platform.companyPlatform.CustomizedRepo;

public interface CustomizedCompanyRepo {
    String findByCompanyId(String id);
    String findByCompanyEmail(String email);

}


