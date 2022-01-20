package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Data
@Builder
@ApiModel("등록된 회사 찾기")
public class CompanyExistIdDto {

    private List<CompanyIdDto> existId;
    private HttpStatus httpStatus;
    private String msg;

}
