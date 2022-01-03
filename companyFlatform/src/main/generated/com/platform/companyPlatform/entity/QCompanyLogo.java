package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompanyLogo is a Querydsl query type for CompanyLogo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompanyLogo extends EntityPathBase<CompanyLogo> {

    private static final long serialVersionUID = 564396841L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompanyLogo companyLogo = new QCompanyLogo("companyLogo");

    public final StringPath biId = createString("biId");

    public final QCompany company;

    public final DatePath<java.time.LocalDate> createDate = createDate("createDate", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> updateDate = createDate("updateDate", java.time.LocalDate.class);

    public QCompanyLogo(String variable) {
        this(CompanyLogo.class, forVariable(variable), INITS);
    }

    public QCompanyLogo(Path<? extends CompanyLogo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompanyLogo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompanyLogo(PathMetadata metadata, PathInits inits) {
        this(CompanyLogo.class, metadata, inits);
    }

    public QCompanyLogo(Class<? extends CompanyLogo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.company = inits.isInitialized("company") ? new QCompany(forProperty("company")) : null;
    }

}

