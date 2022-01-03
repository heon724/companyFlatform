package com.platform.companyPlatform.serviceImpl;

import com.platform.companyPlatform.dto.company.CompanyDupCheckDto;
import com.platform.companyPlatform.repository.CompanyRepository;
import com.platform.companyPlatform.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    MessageSource messageSource;

    @Override
    public CompanyDupCheckDto companyDupCheckId(String id) {
        String idDupCheck = companyRepository.findByCompanyId(id);

        if(idDupCheck==null) {
            return CompanyDupCheckDto.builder()
                    .dupCheck("성공")
                    .build();
        }
        return CompanyDupCheckDto.builder()
                .dupCheck("실패")
                .build();
    }
}
