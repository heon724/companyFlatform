package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SUGGESTIONS")
public class Suggestions {

    @Id
    @Column(name = "suggestion_seq")
    private long suggestSeq;

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
