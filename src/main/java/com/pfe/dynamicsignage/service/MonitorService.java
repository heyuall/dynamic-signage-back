package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.Monitor;
import com.pfe.dynamicsignage.dto.MonitorDto;

import java.util.List;
import java.util.Optional;

public interface MonitorService {
    Monitor addAfficheur(MonitorDto monitorDto);

    List<Monitor> getAll();

    void deleteAfficheurById(Long id);

    Optional<Monitor> findAfficheurById(Long id);

    Monitor affectLayoutGrid(Long afficheurId, Long layoutGridId);
}
