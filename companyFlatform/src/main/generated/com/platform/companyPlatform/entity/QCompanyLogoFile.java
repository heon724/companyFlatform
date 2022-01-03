package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompanyLogoFile is a Querydsl query type for CompanyLogoFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompanyLogoFile extends EntityPathBase<CompanyLogoFile> {

    private static final long serialVersionUID = -598888379L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompanyLogoFile companyLogoFile = new QCompanyLogoFile("companyLogoFile");

    public final QCompanyLogo companyLogo;

    public final DatePath<java.time.LocalDate> logoAuthDate = createDate("logoAuthDate", java.time.LocalDate.class);

    public final StringPath logoFileName = createString("logoFileName");

    public final StringPath logoFilePath = createString("logoFilePath");

    public final NumberPath<Long> logoFileSeq = createNumber("logoFileSeq", Long.class);

    public QCompanyLogoFile(String variable) {
        this(CompanyLogoFile.class, forVariable(variable), INITS);
    }

    public QCompanyLogoFile(Path<? extends CompanyLogoFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompanyLogoFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompanyLogoFile(PathMetadata metadata, PathInits inits) {
        this(CompanyLogoFile.class, metadata, inits);
    }

    public QCompanyLogoFile(Class<? extends CompanyLogoFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.companyLogo = inits.isInitialized("companyLogo") ? new QCompanyLogo(forProperty("companyLogo"), inits.get("companyLogo")) : null;
    }

}

