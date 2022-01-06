package com.platform.companyPlatform.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name="employee_id")
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
}


