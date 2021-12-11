package com.flatform.companyFlatform.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {

    @Id
    @Column(name = "schedule_seq")
    private long scheduleSeq;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false, name = "start_time")
    private LocalDateTime startTime;

    @Column(nullable = false, name = "end_time")
    private LocalDateTime endTime;

    @Column(nullable = false)
    private String empId;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;
}
