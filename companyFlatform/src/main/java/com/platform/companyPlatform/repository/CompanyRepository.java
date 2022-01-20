package com.platform.companyPlatform.repository;


import com.platform.companyPlatform.CustomizedRepo.CustomizedCompanyRepo;
import com.platform.companyPlatform.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> , CustomizedCompanyRepo {
    List<Company> findByCompanyIdContaining(String id);
}