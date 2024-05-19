package com.carlos.jw.organizadorterritoriosjw.model;

import com.carlos.jw.organizadorterritoriosjw.enums.Density;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "quadrants")
@Getter
@Setter
@NoArgsConstructor
public class Quadrant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String description;
    private double area;
    private double perimeter;
    private Density populationDensity;
    private Integer mobilityDifficulty;
    private LocalDate lastUsed;
    @ManyToOne
    @JoinColumn(name = "territory_id")
    private Territory territory;
}