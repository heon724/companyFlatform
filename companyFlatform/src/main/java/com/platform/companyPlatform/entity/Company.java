package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPANY")
public class Company {
    @Id
    @Column(name = "company_id")
    private String companyId;

    @Column(name = "company_info")
    private String info;

    @Column(name = "company_location")
    private String location;

    @Column(unique = true)
    private String phone;

    @Column(nullable = false)
    private LocalDate foundDate;

    @OneToMany(mappedBy = "board")
    List<Department> posts = new ArrayList<>();

}
