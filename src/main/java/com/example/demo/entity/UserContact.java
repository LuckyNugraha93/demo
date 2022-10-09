package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_contact")
public class UserContact {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "address")
    private String address;
    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;
}
