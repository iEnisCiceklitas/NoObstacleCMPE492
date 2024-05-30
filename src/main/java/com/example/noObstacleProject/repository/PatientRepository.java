package com.example.noObstacleProject.repository;
import com.example.noObstacleProject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
