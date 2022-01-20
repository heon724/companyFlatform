package com.platform.companyPlatform.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="company")
@NoArgsConstructor
@AllArgsConstructor
@Builder

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
    private String foundDate;



}
