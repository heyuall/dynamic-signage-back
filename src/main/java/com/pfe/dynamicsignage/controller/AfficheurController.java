package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.Afficheur;
import com.pfe.dynamicsignage.model.AfficheurModel;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.AfficheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/Afficheur")

public class AfficheurController {
    @Autowired
    private AfficheurService afficheurService;

    @GetMapping("/all")
    public List<Afficheur> getAll() {
        return afficheurService.getAll();
    }

    @PostMapping("/add")
    public Afficheur addAfficheur(@RequestBody final AfficheurModel afficheurModel) {
        return afficheurService.addAfficheur(afficheurModel);
    }

    @PostMapping("/{id}/affect")
    public Afficheur affectLayoutGrid(@RequestBody final LayoutGridModel layoutGridModel,
                                      @PathVariable Long id) {
        return afficheurService.affectLayoutGrid( layoutGridModel, id);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteAfficheurById(@PathVariable final Long id){
        this.afficheurService.deleteAfficheurById(id);
    }
}
