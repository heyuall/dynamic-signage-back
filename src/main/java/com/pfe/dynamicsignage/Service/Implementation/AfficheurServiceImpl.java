package com.pfe.dynamicsignage.Service.Implementation;

import com.pfe.dynamicsignage.Entity.Afficheur;
import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Model.AfficheurModel;
import com.pfe.dynamicsignage.Model.LayoutGridModel;
import com.pfe.dynamicsignage.Service.AfficheurService;
import com.pfe.dynamicsignage.dao.AfficheurDao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfficheurServiceImpl implements AfficheurService {
    @Autowired
    private AfficheurDao afficheurDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Afficheur> getAll(){
        return  afficheurDao.findAll();
    }

    public Afficheur addAfficheur(AfficheurModel afficheurModel) {
        Afficheur afficheur = modelMapper.map(afficheurModel,Afficheur.class);

        return afficheurDao.save(afficheur);
    }

    public Afficheur affectLayoutGrid (LayoutGridModel layoutGridModel, Long id) {
        Afficheur afficheur = afficheurDao.findById(id).get();
        LayoutGrid layoutGrid = modelMapper.map(layoutGridModel,LayoutGrid.class);

        afficheur.setLayoutGrid(layoutGrid);

        return afficheurDao.save(afficheur);
    }

}
