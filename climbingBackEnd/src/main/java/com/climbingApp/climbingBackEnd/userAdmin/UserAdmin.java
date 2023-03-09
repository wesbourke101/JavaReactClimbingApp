package com.climbingApp.climbingBackEnd.userAdmin;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_admin")
public class UserAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "user_name")
    private String userName;



}
