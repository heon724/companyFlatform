package com.platform.companyPlatform.serviceImpl;

import com.platform.companyPlatform.component.ErrorCode;
import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.exception.CompanyException;
import com.platform.companyPlatform.repository.CompanyRepository;
import com.platform.companyPlatform.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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

        if (idDupCheck != null) {
            return CompanyDupCheckDto.builder()
                    .httpStatus(HttpStatus.OK)
                    .dupCheck("N")
                    .build();
        } else {
            throw new CompanyException(HttpStatus.BAD_REQUEST,
                    messageSource.getMessage("error.company.notfound.company.valid.E0001", new String[]{id}, Locale.KOREA), ErrorCode.ID_DUPLICATION);
        }
    }
}
