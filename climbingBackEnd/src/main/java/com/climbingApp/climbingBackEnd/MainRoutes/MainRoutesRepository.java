package com.climbingApp.climbingBackEnd.MainRoutes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRoutesRepository extends JpaRepository<MainRoutes, Long> {
}
