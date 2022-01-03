package com.platform.companyPlatform.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Entity(name="company")
@NoArgsConstructor


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

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private LocalDate foundDate;



}
