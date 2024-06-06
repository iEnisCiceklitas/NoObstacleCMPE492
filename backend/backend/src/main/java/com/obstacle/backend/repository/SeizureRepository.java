package com.obstacle.backend.repository;

import com.obstacle.backend.model.Seizure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeizureRepository extends JpaRepository<Seizure, Long> {
}
