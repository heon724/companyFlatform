package com.platform.companyPlatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "chattingparticipant")
public class ChattingParticipant {
    @Id
    @Column(name = "chat_room_name")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long chatRoomName;

    @ManyToOne
    @JoinColumn(name="chatting_seq")
    private Chatting chatting;

    @Column(name="employee_id",nullable = false)
    private String empId;

    @Column(nullable = false)
    private String name;
}
