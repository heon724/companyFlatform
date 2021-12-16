package com.platform.companyPlatform.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "COMPANYLOGO")
public class CompanyLogo {
    @Id
    @Column(name = "BI_id")
    private String BiId;

    @Column(nullable = false)
    private String companyId;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "update_date")
    private LocalDate updateDate;
}
