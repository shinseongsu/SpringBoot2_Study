package com.jpalecture.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Member")
public class Member {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    @Column
    private String name;

}
