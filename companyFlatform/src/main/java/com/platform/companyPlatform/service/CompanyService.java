package com.platform.companyPlatform.service;

import com.platform.companyPlatform.dto.company.CompanyDto;
import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.dto.company.CompanyExistIdDto;

public interface CompanyService {
     CompanyDupCheckDto companyDupCheckId(String id);
     CompanyDupCheckDto companyDupCheckEmail(String email);
     int companyEnroll(CompanyDto company);
     CompanyExistIdDto companyFind(String id);


}
