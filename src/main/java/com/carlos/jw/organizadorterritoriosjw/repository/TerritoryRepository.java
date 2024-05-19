package com.carlos.jw.organizadorterritoriosjw.repository;

import com.carlos.jw.organizadorterritoriosjw.model.Territory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerritoryRepository extends JpaRepository<Territory, Long> {
}
