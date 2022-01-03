package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notice")
public class Notice {
    @Id
    @Column(name = "notice_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long noticeSeq;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

}
