package com.pfe.dynamicsignage.Service;

import com.pfe.dynamicsignage.Entity.Afficheur;
import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Model.AfficheurModel;
import com.pfe.dynamicsignage.Model.LayoutGridModel;

import java.util.List;

public interface AfficheurService {
    public Afficheur addAfficheur(AfficheurModel afficheurModel);


    public List<Afficheur> getAll();

    public Afficheur affectLayoutGrid(LayoutGridModel layoutGridModel, Long id);
}
