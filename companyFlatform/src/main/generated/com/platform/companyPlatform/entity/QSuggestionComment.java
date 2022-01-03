package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSuggestionComment is a Querydsl query type for SuggestionComment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSuggestionComment extends EntityPathBase<SuggestionComment> {

    private static final long serialVersionUID = -237013412L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSuggestionComment suggestionComment = new QSuggestionComment("suggestionComment");

    public final NumberPath<Long> commentSeq = createNumber("commentSeq", Long.class);

    public final StringPath content = createString("content");

    public final StringPath empId = createString("empId");

    public final QSuggestions suggestions;

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QSuggestionComment(String variable) {
        this(SuggestionComment.class, forVariable(variable), INITS);
    }

    public QSuggestionComment(Path<? extends SuggestionComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSuggestionComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSuggestionComment(PathMetadata metadata, PathInits inits) {
        this(SuggestionComment.class, metadata, inits);
    }

    public QSuggestionComment(Class<? extends SuggestionComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.suggestions = inits.isInitialized("suggestions") ? new QSuggestions(forProperty("suggestions"), inits.get("suggestions")) : null;
    }

}

