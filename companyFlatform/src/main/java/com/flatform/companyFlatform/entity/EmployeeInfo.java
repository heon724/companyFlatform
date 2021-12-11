package com.flatform.companyFlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEEINFO")
public class EmployeeInfo {
    @Id
    @Column(name = "employee_id")
    private String empId;

    @OneToOne(mappedBy = "employee_info")
    private Employee employee;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private LocalDate hireDate;

    @Column(name = "Dept_id")
    private String deptId;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department department;
}
