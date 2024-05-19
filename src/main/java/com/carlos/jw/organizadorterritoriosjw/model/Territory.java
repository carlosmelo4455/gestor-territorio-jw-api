package com.carlos.jw.organizadorterritoriosjw.model;

import com.carlos.jw.organizadorterritoriosjw.model.Quadrant;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Entity
@Table(name = "territories")
@Getter
@Setter
@NoArgsConstructor
public class Territory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String description;
    private LocalDate lastUpdated;
    private Boolean isAssigned;
    private Integer priority;
    private Double totalArea;
    private Double totalPerimeter;
    @OneToMany(mappedBy = "territory")
    private List<Quadrant> quadrants;
}
