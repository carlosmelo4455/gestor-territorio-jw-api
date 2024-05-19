package com.carlos.jw.organizadorterritoriosjw.dto;

import lombok.Data;

@Data
public class CreateTerritoryDTO {
    private String name;
    private String description;
    private Integer priority;
    private Long quadrants;
}