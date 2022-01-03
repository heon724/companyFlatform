package com.platform.companyPlatform.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "companylogofile")
public class CompanyLogoFile {
    @Id
    @Column(name = "logo_file_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long logoFileSeq;

    @ManyToOne
    @JoinColumn(name = "bl_id")
    private CompanyLogo companyLogo;

    @Column(name = "logo_file_name")
    private String logoFileName;

    @Column(name = "logo_file_path")
    private String logoFilePath;

    @Column(name = "logo_auth_date")
    LocalDate logoAuthDate;
}
