package com.climbingApp.climbingBackEnd.MainRoutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/main-routes")
public class MainRoutesController {

    @Autowired
    private MainRoutesService mainRoutesService;

    // GET all main routes
    @GetMapping("")
    public ResponseEntity<List<MainRoutes>> getAllMainRoutes() {
        List<MainRoutes> mainRoutes = mainRoutesService.getAllMainRoutes();
        return ResponseEntity.ok().body(mainRoutes);
    }

    // GET a main route by ID
    @GetMapping("/{id}")
    public ResponseEntity<MainRoutes> getMainRouteById(@PathVariable Long id) {
        MainRoutes mainRoute = mainRoutesService.getMainRouteById(id);
        return ResponseEntity.ok().body(mainRoute);
    }

    // POST a new main route
    @PostMapping("")
    public ResponseEntity<MainRoutes> createMainRoute(@RequestBody MainRoutes mainRoute) {
        MainRoutes createdMainRoute = mainRoutesService.createMainRoute(mainRoute);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMainRoute);
    }

    // PUT (update) an existing main route
    @PutMapping("/{id}")
    public ResponseEntity<MainRoutes> updateMainRoute(@PathVariable Long id, @RequestBody MainRoutes mainRoute) {
        MainRoutes updatedMainRoute = mainRoutesService.updateMainRoute(id, mainRoute);
        return ResponseEntity.ok().body(updatedMainRoute);
    }

    // DELETE a main route by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMainRoute(@PathVariable Long id) {
        mainRoutesService.deleteMainRoute(id);
        return ResponseEntity.noContent().build();
    }

}
