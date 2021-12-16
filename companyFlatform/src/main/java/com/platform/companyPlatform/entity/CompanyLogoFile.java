package com.platform.companyPlatform.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "COMPANYLOGOFile")
public class CompanyLogoFile {
    @Id
    @Column(name = "logo_id")
    private String logoId;

    @ManyToOne
    @JoinColumn(name = "BI_id")
    private CompanyLogo companyLogo;

    @Column(name = "logo_file_name")
    private String logoFileName;

    @Column(name = "logo_file_path")
    private String logoFilePath;

    @Column(name = "logo_auth_date")
    LocalDate logoAuthDate;
}
