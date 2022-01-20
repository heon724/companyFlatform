package com.platform.companyPlatform.serviceImpl;


import com.platform.companyPlatform.component.ErrorCode;
import com.platform.companyPlatform.dto.company.CompanyDto;
import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.dto.company.CompanyExistIdDto;
import com.platform.companyPlatform.dto.company.CompanyIdDto;
import com.platform.companyPlatform.entity.Company;
import com.platform.companyPlatform.exception.CompanyException;
import com.platform.companyPlatform.repository.CompanyRepository;
import com.platform.companyPlatform.service.CompanyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    MessageSource messageSource;

    @Override
    public CompanyDupCheckDto companyDupCheckId(String id) {
        String idDupCheck = companyRepository.findByCompanyId(id);

        if (StringUtils.isBlank(id)) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.notfound.company.valid.E0001", new String[]{"id"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        }


        if (idDupCheck != null) {
            return CompanyDupCheckDto.builder()
                    .httpStatus(HttpStatus.OK)
                    .dupCheck("N")
                    .build();
        } else {
            return CompanyDupCheckDto.builder()
                    .httpStatus(HttpStatus.OK)
                    .dupCheck("Y")
                    .build();
        }
    }

    @Override
    public CompanyDupCheckDto companyDupCheckEmail(String email) {
        String emailDupCheck = companyRepository.findByCompanyEmail(email);

        if (StringUtils.isBlank(email)) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.notfound.company.valid.E0001", new String[]{"email"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        }

        if (emailDupCheck != null) {
            return CompanyDupCheckDto.builder()
                    .httpStatus(HttpStatus.OK)
                    .dupCheck("N")
                    .build();
        } else {
            return CompanyDupCheckDto.builder()
                    .httpStatus(HttpStatus.OK)
                    .dupCheck("Y")
                    .build();
        }
    }

    @Override
    public int companyEnroll(CompanyDto company) {
        if (company.getCompanyId().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"ID"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        } else if (company.getInfo().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"Info"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        } else if (company.getLocation().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"Location"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        } else if (company.getPhone().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"phone"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        } else if (company.getEmail().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"Email"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        } else if (company.getFoundDate().isEmpty()) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.inputnull.company.valid.E0002", new String[]{"FoundDate"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        }

        Company company1 = companyRepository.save(Company.builder()
                .companyId(company.getCompanyId())
                .info(company.getInfo())
                .location(company.getLocation())
                .phone(company.getPhone())
                .email(company.getEmail())
                .foundDate(company.getFoundDate())
                .build());

        return company1 == null ? 0:1;
    }

    @Override
    public CompanyExistIdDto companyFind(String id) {

        if (StringUtils.isBlank(id)) {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.notfound.company.valid.E0001", new String[]{"id"}, Locale.KOREA), ErrorCode.BAD_REQUEST);
        }

        List<Company> findIdList = companyRepository.findByCompanyIdContaining(id);
        List<CompanyIdDto> findIdDto = new ArrayList<>();

        if (findIdList.size() ==0 ) {
            throw new CompanyException(HttpStatus.NOT_FOUND,
                    messageSource.getMessage("error.company.notfound.companyIdList.E0003", null, Locale.KOREA), ErrorCode.NOT_FOUND);
        }

        findIdList.forEach(compnay -> {
            findIdDto.add(CompanyIdDto.builder()
                    .existId(compnay.getCompanyId())
                    .build());
        });

        return CompanyExistIdDto.builder()
                .httpStatus(HttpStatus.OK)
                .existId(findIdDto)
                .build();
    }
}
