package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.AfficheurDao;
import com.pfe.dynamicsignage.entity.Afficheur;
import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.model.AfficheurModel;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.AfficheurService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfficheurServiceImpl implements AfficheurService {
    @Autowired
    private AfficheurDao afficheurDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Afficheur> getAll() {
        return afficheurDao.findAll();
    }

    public Afficheur addAfficheur(AfficheurModel afficheurModel) {
        Afficheur afficheur = modelMapper.map(afficheurModel, Afficheur.class);

        return afficheurDao.save(afficheur);
    }

    public Afficheur affectLayoutGrid(LayoutGridModel layoutGridModel, Long id) {
        Afficheur afficheur = afficheurDao.findById(id).get();
        LayoutGrid layoutGrid = modelMapper.map(layoutGridModel, LayoutGrid.class);

        afficheur.setLayoutGrid(layoutGrid);

        return afficheurDao.save(afficheur);
    }

    public Optional<Afficheur> findAfficheurById(Long id) {
        return this.afficheurDao.findById(id);
    }

    public void deleteAfficheurById(Long id) {
        this.findAfficheurById(id).ifPresent(aff ->this.afficheurDao.delete(aff));
    }

}
