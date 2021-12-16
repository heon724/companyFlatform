package com.platform.companyPlatform.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SUGGESTIONCOMMENT")
public class SuggestionComment {
    @Id
    @Column(name = "suggestion_seq")
    private long suggestSeq;

    @ManyToOne
    @JoinColumn(name="suggestion_seq")
    private Suggestions suggestions;

    @Column(nullable = false)
    private String empId;

    @Column(nullable = false)
    private String content;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

}
