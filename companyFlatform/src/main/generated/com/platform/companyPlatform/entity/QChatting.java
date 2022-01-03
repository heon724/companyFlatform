package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatting is a Querydsl query type for Chatting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChatting extends EntityPathBase<Chatting> {

    private static final long serialVersionUID = -1439102331L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatting chatting = new QChatting("chatting");

    public final NumberPath<Long> chattingSeq = createNumber("chattingSeq", Long.class);

    public final QEmployee employee;

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QChatting(String variable) {
        this(Chatting.class, forVariable(variable), INITS);
    }

    public QChatting(Path<? extends Chatting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatting(PathMetadata metadata, PathInits inits) {
        this(Chatting.class, metadata, inits);
    }

    public QChatting(Class<? extends Chatting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
    }

}

