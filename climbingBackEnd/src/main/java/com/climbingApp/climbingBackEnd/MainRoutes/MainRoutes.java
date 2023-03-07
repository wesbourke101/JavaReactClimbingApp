package com.climbingApp.climbingBackEnd.MainRoutes;

import jakarta.persistence.*;

@Entity
@Table(name = "main_routes")
public class MainRoutes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID.IDENTITY)
    private Long id;
    private String routeName;
    private int heightOfClimb;
    private double gradeOfClimb;
    private String descriptionOfAscent;
    private int gearId;
    private int userId;
    private boolean climbCompleted;

    public MainRoutes(Long id, String routeName, int heightOfClimb, double gradeOfClimb, String descriptionOfAscent, int gearId, int userId, boolean climbCompleted) {
        this.id = id;
        this.routeName = routeName;
        this.heightOfClimb = heightOfClimb;
        this.gradeOfClimb = gradeOfClimb;
        this.descriptionOfAscent = descriptionOfAscent;
        this.gearId = gearId;
        this.userId = userId;
        this.climbCompleted = climbCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getHeightOfClimb() {
        return heightOfClimb;
    }

    public void setHeightOfClimb(int heightOfClimb) {
        this.heightOfClimb = heightOfClimb;
    }

    public double getGradeOfClimb() {
        return gradeOfClimb;
    }

    public void setGradeOfClimb(double gradeOfClimb) {
        this.gradeOfClimb = gradeOfClimb;
    }

    public String getDescriptionOfAscent() {
        return descriptionOfAscent;
    }

    public void setDescriptionOfAscent(String descriptionOfAscent) {
        this.descriptionOfAscent = descriptionOfAscent;
    }

    public int getGearId() {
        return gearId;
    }

    public void setGearId(int gearId) {
        this.gearId = gearId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isClimbCompleted() {
        return climbCompleted;
    }

    public void setClimbCompleted(boolean climbCompleted) {
        this.climbCompleted = climbCompleted;
    }


}
