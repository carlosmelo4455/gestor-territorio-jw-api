package com.carlos.jw.organizadorterritoriosjw.service;

import com.carlos.jw.organizadorterritoriosjw.dto.CreateTerritoryDTO;
import com.carlos.jw.organizadorterritoriosjw.repository.TerritoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TerritoryService {

    private final TerritoryRepository territoryRepository;

    public void createTerritory(CreateTerritoryDTO territoryDTO) {

    }
}