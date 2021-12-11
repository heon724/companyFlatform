package com.flatform.companyFlatform.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "company_id")
    private String companyId;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    @Column(nullable = false)
    private String deptName;

    @Column(name = "up_dept_id")
    private String upDeptId;

}
