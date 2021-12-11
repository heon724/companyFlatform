package com.flatform.companyFlatform.entity;

import org.springframework.boot.context.properties.bind.Name;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "NOTICE_FILE")
public class NoticeFile {
    @Id
    private long noticeFileSeq;

    @ManyToOne
    @JoinColumn(name = "notice_seq")
    private Notice notice;

    @Column(name = "notice_file_name")
    private String noticeFileName;

    @Column(name = "notice_file_path")
    private String noticeFilePath;

    @Column(name = "notice_auth_date")
    LocalDate noticeAuthDate;
}
