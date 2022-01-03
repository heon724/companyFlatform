package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @Column(name = "schedule_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long scheduleSeq;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false, name = "start_time")
    private LocalDateTime startTime;

    @Column(nullable = false, name = "end_time")
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;
}
