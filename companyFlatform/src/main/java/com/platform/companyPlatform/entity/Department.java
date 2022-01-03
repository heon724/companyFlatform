package com.platform.companyPlatform.entity;


import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "dept_id")
    private String deptId;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    @Column(nullable = false)
    private String deptName;

    @Column(name = "up_dept_id")
    private String upDeptId;

}
