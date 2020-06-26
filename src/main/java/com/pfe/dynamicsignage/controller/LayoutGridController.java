package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.LayoutGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/LayoutGrid")

public class LayoutGridController {
    @Autowired
    private LayoutGridService layoutGridService;

    @GetMapping("/all")
    public List<LayoutGrid> getAll() {
        return layoutGridService.getAll();
    }

    @PostMapping("/add")
    public LayoutGrid addLayoutGrid ( @RequestBody final LayoutGridModel layoutGridModel){
        return layoutGridService.addLayoutGrid(layoutGridModel);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteLayoutGrid(@PathVariable final Long id){
        this.layoutGridService.deleteLayoutGridById(id);
    }

}
