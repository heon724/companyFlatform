package com.platform.companyPlatform.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeFile is a Querydsl query type for NoticeFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNoticeFile extends EntityPathBase<NoticeFile> {

    private static final long serialVersionUID = -542355213L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeFile noticeFile = new QNoticeFile("noticeFile");

    public final QNotice notice;

    public final DatePath<java.time.LocalDate> noticeAuthDate = createDate("noticeAuthDate", java.time.LocalDate.class);

    public final StringPath noticeFileName = createString("noticeFileName");

    public final StringPath noticeFilePath = createString("noticeFilePath");

    public final NumberPath<Long> noticeFileSeq = createNumber("noticeFileSeq", Long.class);

    public QNoticeFile(String variable) {
        this(NoticeFile.class, forVariable(variable), INITS);
    }

    public QNoticeFile(Path<? extends NoticeFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeFile(PathMetadata metadata, PathInits inits) {
        this(NoticeFile.class, metadata, inits);
    }

    public QNoticeFile(Class<? extends NoticeFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notice = inits.isInitialized("notice") ? new QNotice(forProperty("notice"), inits.get("notice")) : null;
    }

}

