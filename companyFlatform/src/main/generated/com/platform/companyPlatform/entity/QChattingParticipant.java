package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChattingParticipant is a Querydsl query type for ChattingParticipant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChattingParticipant extends EntityPathBase<ChattingParticipant> {

    private static final long serialVersionUID = 1762604910L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChattingParticipant chattingParticipant = new QChattingParticipant("chattingParticipant");

    public final NumberPath<Long> chatRoomName = createNumber("chatRoomName", Long.class);

    public final QChatting chatting;

    public final StringPath empId = createString("empId");

    public final StringPath name = createString("name");

    public QChattingParticipant(String variable) {
        this(ChattingParticipant.class, forVariable(variable), INITS);
    }

    public QChattingParticipant(Path<? extends ChattingParticipant> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChattingParticipant(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChattingParticipant(PathMetadata metadata, PathInits inits) {
        this(ChattingParticipant.class, metadata, inits);
    }

    public QChattingParticipant(Class<? extends ChattingParticipant> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatting = inits.isInitialized("chatting") ? new QChatting(forProperty("chatting"), inits.get("chatting")) : null;
    }

}

