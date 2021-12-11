package com.flatform.companyFlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CHATTING")
public class Chatting {
    @Id
    @Column(name = "chatting_seq")
    private long chattingSeq;

    @Column(nullable = false)
    private String empId;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Column(nullable = false)
    private String title;

    @Column(name = "update_time")
    private LocalDateTime updateTime;
}
