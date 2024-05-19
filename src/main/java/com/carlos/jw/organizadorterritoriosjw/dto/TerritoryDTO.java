package com.carlos.jw.organizadorterritoriosjw.dto;

import com.carlos.jw.organizadorterritoriosjw.model.Quadrant;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class TerritoryDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDate lastUpdated;
    private Boolean isAssigned;
    private Integer priority;
    private List<Quadrant> quadrants;
}
