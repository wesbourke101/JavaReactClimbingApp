package com.climbingApp.climbingBackEnd.CommunityGear;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "community_gear")
public class CommunityGear {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "gear_name", nullable = false)
    private String gearName;

    @Column(name = "gear_size", nullable = false)
    private double gearSize;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime purchaseDate;

    @Column(name = "community_image")
    private byte communityImage;

    @Column(name = "user_id")
    private Long userId;

    public CommunityGear() {
        this.id = UUID.randomUUID();;
    }

    public CommunityGear(String gearName, double gearSize, LocalDateTime purchaseDate, byte communityImage, Long userId) {
        this.id = UUID.randomUUID();
        this.gearName = gearName;
        this.gearSize = gearSize;
        this.purchaseDate = purchaseDate;
        this.communityImage = communityImage;
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getGearName() {
        return gearName;
    }

    public void setGearName(String gearName) {
        this.gearName = gearName;
    }

    public double getGearSize() {
        return gearSize;
    }

    public void setGearSize(double gearSize) {
        this.gearSize = gearSize;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public byte getCommunityImage() {
        return communityImage;
    }

    public void setCommunityImage(byte communityImage) {
        this.communityImage = communityImage;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
