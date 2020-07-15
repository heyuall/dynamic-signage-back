package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.Monitor;
import com.pfe.dynamicsignage.model.MonitorModel;
import com.pfe.dynamicsignage.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/Afficheur")

public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @GetMapping("/all")
    public List<Monitor> getAll() {
        return monitorService.getAll();
    }

    @PostMapping("/add")
    public Monitor addAfficheur(@RequestBody final MonitorModel monitorModel) {
        return monitorService.addAfficheur(monitorModel);
    }

    @PostMapping("/{afficheurId}/affectLayoutGrid/{layoutGridId}")
    public Monitor affectLayoutGrid(@PathVariable  Long afficheurId,
                                    @PathVariable Long layoutGridId) {
        return monitorService.affectLayoutGrid( afficheurId, layoutGridId);
    }

    @DeleteMapping("/{id}")
    public void deleteAfficheurById(@PathVariable final Long id){
        this.monitorService.deleteAfficheurById(id);
    }
}
