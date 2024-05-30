package com.example.noObstacleProject.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Blood type is required")
    private String bloodType;

    private String regularMedication;

    @ElementCollection
    @Size(max = 3, message = "Can have up to 3 emergency contacts")
    private List<String> emergencyContacts;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }
    public String getRegularMedication() { return regularMedication; }
    public void setRegularMedication(String regularMedication) { this.regularMedication = regularMedication; }
    public List<String> getEmergencyContacts() { return emergencyContacts; }
    public void setEmergencyContacts(List<String> emergencyContacts) { this.emergencyContacts = emergencyContacts; }
}
