package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.Afficheur;
import com.pfe.dynamicsignage.model.AfficheurModel;
import com.pfe.dynamicsignage.model.LayoutGridModel;

import java.util.List;
import java.util.Optional;

public interface AfficheurService {
    public Afficheur addAfficheur(AfficheurModel afficheurModel);

    public List<Afficheur> getAll();

    public void deleteAfficheurById(Long id);

    public Optional<Afficheur> findAfficheurById(Long id);

    public Afficheur affectLayoutGrid(LayoutGridModel layoutGridModel, Long id);
}
