package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "suggestions")
public class Suggestions {

    @Id
    @Column(name = "suggestion_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long suggestSeq;

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
