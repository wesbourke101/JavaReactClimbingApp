package com.climbingApp.climbingBackEnd.CommunityGear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityGearService {

    private final CommunityGearInterface communityGearRepository;

    @Autowired
    public CommunityGearService(CommunityGearInterface communityGearRepository) {
        this.communityGearRepository = communityGearRepository;
    }

    public List<CommunityGear> getAllCommunityGear() {
        return communityGearRepository.findAll();
    }

    public CommunityGear getCommunityGearById(Long id) {
        return communityGearRepository.findById(id).orElseThrow(() -> new RuntimeException("Community gear not found with id " + id));
    }

    public CommunityGear addCommunityGear(CommunityGear communityGear) {
        return communityGearRepository.save(communityGear);
    }

    public CommunityGear updateCommunityGear(Long id, CommunityGear communityGear) {
        CommunityGear existingCommunityGear = communityGearRepository.findById(id).orElseThrow(() -> new RuntimeException("Community gear not found with id " + id));
        existingCommunityGear.setGearName(communityGear.getGearName());
        existingCommunityGear.setGearSize(communityGear.getGearSize());
        existingCommunityGear.setPurchaseDate(communityGear.getPurchaseDate());
        existingCommunityGear.setCommunityImage(communityGear.getCommunityImage());
        existingCommunityGear.setUserId(communityGear.getUserId());
        return communityGearRepository.save(existingCommunityGear);
    }

    public void deleteCommunityGear(Long id) {
        CommunityGear existingCommunityGear = communityGearRepository.findById(id).orElseThrow(() -> new RuntimeException("Community gear not found with id " + id));
        communityGearRepository.delete(existingCommunityGear);
    }
}
