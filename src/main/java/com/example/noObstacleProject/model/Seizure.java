package com.example.noObstacleProject.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "seizures")
public class Seizure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime seizureTime;  // Krizin zamanı

    @Column(nullable = false)
    private Integer duration;  // Krizin süresi (dakika cinsinden)

    @Column(nullable = false)
    private String location;  // Hasta konumu

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDateTime getSeizureTime() { return seizureTime; }
    public void setSeizureTime(LocalDateTime seizureTime) { this.seizureTime = seizureTime; }
    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
