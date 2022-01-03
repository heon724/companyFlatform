package com.platform.companyPlatform.repository;


import com.platform.companyPlatform.entity.Company;
import com.platform.companyPlatform.CustomizedRepo.CustomizedCompanyRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> , CustomizedCompanyRepo {

}