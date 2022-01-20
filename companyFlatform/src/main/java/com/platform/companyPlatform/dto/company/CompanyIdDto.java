package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
@Builder
@ApiModel("등록된 회사 찾기")
public class CompanyIdDto {

    private String existId;

}
