package com.example.noObstacleProject.controller;
import com.example.noObstacleProject.model.Patient;
import com.example.noObstacleProject.model.User;
import com.example.noObstacleProject.service.PatientService;
import com.example.noObstacleProject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private UserService userService;

    @PostMapping("/{username}/register")
    public ResponseEntity<Patient> registerPatient(@Valid @RequestBody Patient patient,@PathVariable String username) {
        User user = userService.findByUsername(username);
        user.setPatient(patient);
        userService.saveUser(user);

        return ResponseEntity.ok(user.getPatient());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Patient> getPatient(@PathVariable String name) {
        Patient patient = userService.findByUsername(name).getPatient();

            return ResponseEntity.ok(patient);

    }
}
