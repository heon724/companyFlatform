package com.platform.companyPlatform.controller;

import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.service.CompanyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags ={"회사"})
@RestController
@RequestMapping("/company")


public class CompanyController {

    @Autowired
    CompanyService companyService;


    @GetMapping("/company-id/{id}/dupCheck")
    public CompanyDupCheckDto companyDupCheckId(@PathVariable("id") String id) {
        return companyService.companyDupCheckId(id);
    }





}
