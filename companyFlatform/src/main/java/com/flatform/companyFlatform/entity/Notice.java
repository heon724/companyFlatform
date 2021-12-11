package com.flatform.companyFlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "NOTICE")
public class Notice {
    @Id
    @Column(name = "notice_seq")
    private long noticeSeq;

    @Column(nullable = false)
    private String empId;

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
