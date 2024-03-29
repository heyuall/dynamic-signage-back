package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.Monitor;
import com.pfe.dynamicsignage.model.MonitorModel;

import java.util.List;
import java.util.Optional;

public interface MonitorService {
    public Monitor addAfficheur(MonitorModel monitorModel);

    public List<Monitor> getAll();

    public void deleteAfficheurById(Long id);

    public Optional<Monitor> findAfficheurById(Long id);

    public Monitor affectLayoutGrid(Long afficheurId, Long layoutGridId);
}
