package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSuggestions is a Querydsl query type for Suggestions
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSuggestions extends EntityPathBase<Suggestions> {

    private static final long serialVersionUID = -452294064L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSuggestions suggestions = new QSuggestions("suggestions");

    public final StringPath content = createString("content");

    public final QEmployee employee;

    public final NumberPath<Long> suggestSeq = createNumber("suggestSeq", Long.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QSuggestions(String variable) {
        this(Suggestions.class, forVariable(variable), INITS);
    }

    public QSuggestions(Path<? extends Suggestions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSuggestions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSuggestions(PathMetadata metadata, PathInits inits) {
        this(Suggestions.class, metadata, inits);
    }

    public QSuggestions(Class<? extends Suggestions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
    }

}

