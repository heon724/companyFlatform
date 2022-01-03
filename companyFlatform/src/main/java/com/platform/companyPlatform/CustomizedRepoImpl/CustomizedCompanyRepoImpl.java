package com.platform.companyPlatform.CustomizedRepoImpl;

import com.platform.companyPlatform.CustomizedRepo.CustomizedCompanyRepo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import static com.platform.companyPlatform.entity.QCompany.company;


public class CustomizedCompanyRepoImpl implements CustomizedCompanyRepo {

    final private JPAQueryFactory jpaQueryFactory;

    public CustomizedCompanyRepoImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }


    @Override
    public String findByCompanyId(String id) {
        return jpaQueryFactory.select(company.companyId)
                .from(company)
                .where(company.companyId.eq(id))
                .fetchOne();
//        return null;
    }
}
