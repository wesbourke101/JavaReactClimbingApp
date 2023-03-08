package com.climbingApp.climbingBackEnd.communityClimbs;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_climber")
public class UserClimbs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "userClimb_name")
    private String userClimbName;

//    @Column(name = "gear_used_gear_id")
//    private

}
