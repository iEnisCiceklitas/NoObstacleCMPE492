package com.example.noObstacleProject.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Blood type is required")
    private String bloodType;

    private String regularMedication;

    @ElementCollection
    @Size(max = 3, message = "Can have up to 3 emergency contacts")
    private List<String> emergencyContacts;

    @JsonBackReference
    @OneToOne(mappedBy = "patient", fetch = FetchType.LAZY)
    private User user;
}
