package com.example.noObstacleProject.controller;
import com.example.noObstacleProject.model.Seizure;
import com.example.noObstacleProject.service.SeizureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seizures")
public class SeizureController {
    @Autowired
    private SeizureService seizureService;

    @PostMapping("/register")
    public ResponseEntity<Seizure> registerSeizure(@RequestBody Seizure seizure) {
        Seizure savedSeizure = seizureService.saveSeizure(seizure);
        return ResponseEntity.ok(savedSeizure);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seizure> getSeizure(@PathVariable Long id) {
        Seizure seizure = seizureService.getSeizureById(id);
        if (seizure != null) {
            return ResponseEntity.ok(seizure);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
