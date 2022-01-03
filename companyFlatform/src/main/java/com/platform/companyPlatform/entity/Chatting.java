package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chatting")
public class Chatting {
    @Id
    @Column(name = "chatting_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long chattingSeq;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Column(nullable = false)
    private String title;

    @Column(name = "update_time",nullable = false)
    private LocalDateTime updateTime;
}
