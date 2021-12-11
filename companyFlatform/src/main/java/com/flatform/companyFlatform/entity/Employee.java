package com.flatform.companyFlatform.entity;


import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private String empId;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private EmployeeInfo employeeinfo;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
}


