package com.flatform.companyFlatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "CHATTINGPARTICIPANT")
public class ChattingParticipant {
    @Id
    @Column(name = "chatting_seq")
    private long chattingSeq;

    @ManyToOne
    @JoinColumn(name="chatting_seq")
    private Chatting chatting;

    @Column(nullable = false)
    private String empId;

    @Column(nullable = false)
    private String name;
}
