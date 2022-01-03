package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmployeeInfo is a Querydsl query type for EmployeeInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployeeInfo extends EntityPathBase<EmployeeInfo> {

    private static final long serialVersionUID = 1470370107L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployeeInfo employeeInfo = new QEmployeeInfo("employeeInfo");

    public final QDepartment department;

    public final QEmployee employee;

    public final DatePath<java.time.LocalDate> hireDate = createDate("hireDate", java.time.LocalDate.class);

    public final StringPath job = createString("job");

    public QEmployeeInfo(String variable) {
        this(EmployeeInfo.class, forVariable(variable), INITS);
    }

    public QEmployeeInfo(Path<? extends EmployeeInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmployeeInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmployeeInfo(PathMetadata metadata, PathInits inits) {
        this(EmployeeInfo.class, metadata, inits);
    }

    public QEmployeeInfo(Class<? extends EmployeeInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
    }

}

