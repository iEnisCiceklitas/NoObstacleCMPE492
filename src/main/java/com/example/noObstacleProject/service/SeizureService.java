package com.example.noObstacleProject.service;
import com.example.noObstacleProject.model.Seizure;
import com.example.noObstacleProject.repository.SeizureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeizureService {
    @Autowired
    private SeizureRepository seizureRepository;

    public Seizure saveSeizure(Seizure seizure) {
        return seizureRepository.save(seizure);
    }

    public Seizure getSeizureById(Long id) {
        return seizureRepository.findById(id).orElse(null);
    }
}
