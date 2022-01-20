package com.platform.companyPlatform.controller;

import com.platform.companyPlatform.dto.company.CompanyDto;
import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.dto.company.CompanyExistIdDto;
import com.platform.companyPlatform.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags ={"회사"})
@RestController
@RequestMapping("/company")


public class CompanyController {

    @Autowired
    CompanyService companyService;

    Logger logger = LoggerFactory.getLogger(CompanyController.class);


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

    @PostMapping("/company/enroll")
    @ApiOperation(value = "회사 등록하기", response = CompanyDto.class)
    public int CompanyDupCheckDto(@RequestBody CompanyDto company) {
        int enroll = companyService.companyEnroll(company);
        return enroll;
    }

    @GetMapping("/company/find-id/{id}")
    @ApiOperation(value = "등록된 회사 검색하기", response =CompanyExistIdDto.class )
    public CompanyExistIdDto companyFindId(@PathVariable("id") String id) {
        return companyService.companyFind(id);
    }

}
