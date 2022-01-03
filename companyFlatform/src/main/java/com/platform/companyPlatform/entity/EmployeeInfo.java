package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "employeeinfo")
public class EmployeeInfo implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name ="employee_id")
    private Employee employee;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department department;
}
