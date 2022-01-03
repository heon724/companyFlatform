package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "noticefile")
public class NoticeFile {
    @Id
    @Column(name ="notice_file_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
