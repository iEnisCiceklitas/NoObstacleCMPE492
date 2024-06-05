package com.example.noObstacleProject.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
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

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
