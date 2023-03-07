package com.climbingApp.climbingBackEnd.MainRoutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MainRoutesService {
    @Autowired
    private MainRoutesRepository mainRoutesRepository;

    public List<MainRoutes> getAllMainRoutes() {
        return mainRoutesRepository.findAll();
    }

    public MainRoutes getMainRouteById(Long id) {
        return mainRoutesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Main route not found with id " + id));
    }

    public MainRoutes createMainRoute(MainRoutes mainRoute) {
        return mainRoutesRepository.save(mainRoute);
    }

    public MainRoutes updateMainRoute(Long id, MainRoutes mainRoute) {
        MainRoutes existingMainRoute = mainRoutesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Main route not found with id " + id));

        existingMainRoute.setRouteName(mainRoute.getRouteName());
        existingMainRoute.setHeightOfClimb(mainRoute.getHeightOfClimb());
        existingMainRoute.setGradeOfClimb(mainRoute.getGradeOfClimb());
        existingMainRoute.setDescriptionOfAscent(mainRoute.getDescriptionOfAscent());
        existingMainRoute.setGearId(mainRoute.getGearId());
        existingMainRoute.setUserId(mainRoute.getUserId());
        existingMainRoute.setClimbCompleted(mainRoute.isClimbCompleted());

        try {
            mainRoutesRepository.save(existingMainRoute);
        } catch (DataIntegrityViolationException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid input data", e);
        }

        return existingMainRoute;
    }


    public void deleteMainRoute(Long id) {
        MainRoutes mainRoute = mainRoutesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Main route not found with id " + id));

        try {
            mainRoutesRepository.delete(mainRoute);
        } catch (DataAccessException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to delete main route", e);
        }
    }


}
