package com.carlos.jw.organizadorterritoriosjw.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/territories")
public class TerritoryController {

//    @PostMapping("/create")
//    public ResponseEntity<TerritoryVO> createTerritory(@Valid @RequestBody CreateTerritoryVO createTerritoryVO) throws Exception {
//        TerritoryVO territoryVO = createTerritory.execute(clienteDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(territoryVO);
//    }
}
