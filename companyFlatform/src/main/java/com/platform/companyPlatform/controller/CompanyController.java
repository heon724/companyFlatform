package com.platform.companyPlatform.controller;

import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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


    @GetMapping("/company/dupCheck-id/{id}")
    @ApiOperation(value = "회사아이디 중복 체크", response =CompanyDupCheckDto.class )
    public CompanyDupCheckDto companyDupCheckId(@PathVariable("id") String id) {
        return companyService.companyDupCheckId(id);
    }

    @GetMapping("/company/dupCheck-email/{email}")
    @ApiOperation(value = "회사이메일 중복 체크", response =CompanyDupCheckDto.class )
    public CompanyDupCheckDto companyDupCheckEmail(@PathVariable("email") String email) {
        return companyService.companyDupCheckEmail(email);
    }







}
