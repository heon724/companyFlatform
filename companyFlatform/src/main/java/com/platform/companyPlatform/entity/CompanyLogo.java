package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "companylogo")
public class CompanyLogo {
    @Id
    @Column(name = "bl_id")
    private String biId;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "update_date")
    private LocalDate updateDate;
}
