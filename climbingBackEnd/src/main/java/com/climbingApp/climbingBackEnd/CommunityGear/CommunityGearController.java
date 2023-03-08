package com.climbingApp.climbingBackEnd.CommunityGear;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/community_gear")
public class CommunityGearController {

    private final CommunityGearService communityGearService;

    @PostConstruct
    public void init() {
        LocalDateTime purchaseDate = LocalDateTime.now();
        byte[] bytes = new byte[1];
        new Random().nextBytes(bytes);
        byte randomByte = bytes[0];
        CommunityGear communityGear1 = communityGearService.addCommunityGear(new CommunityGear("Black Diamond C4", .75, purchaseDate, randomByte));
        CommunityGear communityGear2 = communityGearService.addCommunityGear(new CommunityGear("Black Diamond C4", .75, purchaseDate, randomByte));
        CommunityGear communityGear3 = communityGearService.addCommunityGear(new CommunityGear("Black Diamond C4", .75, purchaseDate, randomByte));
        CommunityGear communityGear4 = communityGearService.addCommunityGear(new CommunityGear("Black Diamond C4", .75, purchaseDate, randomByte));
    }

    @Autowired
    public CommunityGearController(CommunityGearService communityGearService) {
        this.communityGearService = communityGearService;
    }

    @GetMapping
    public ResponseEntity<List<CommunityGear>> getAllCommunityGear() {
        List<CommunityGear> communityGear = communityGearService.getAllCommunityGear();
        return new ResponseEntity<>(communityGear, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommunityGear> getCommunityGearById(@PathVariable("id") Long id) {
        CommunityGear communityGear = communityGearService.getCommunityGearById(id);
        return new ResponseEntity<>(communityGear, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CommunityGear> addCommunityGear(@RequestBody CommunityGear communityGear) {
        CommunityGear newCommunityGear = communityGearService.addCommunityGear(communityGear);
        return new ResponseEntity<>(newCommunityGear, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommunityGear> updateCommunityGear(@PathVariable("id") Long id, @RequestBody CommunityGear communityGear) {
        CommunityGear updatedCommunityGear = communityGearService.updateCommunityGear(id, communityGear);
        return new ResponseEntity<>(updatedCommunityGear, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCommunityGear(@PathVariable("id") Long id) {
        communityGearService.deleteCommunityGear(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
