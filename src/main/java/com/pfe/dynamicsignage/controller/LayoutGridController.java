package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.dto.LayoutGridDto;
import com.pfe.dynamicsignage.service.LayoutGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public LayoutGrid addLayoutGrid ( @RequestBody final LayoutGridDto layoutGridDto){
        return layoutGridService.addLayoutGrid(layoutGridDto);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteLayoutGrid(@PathVariable final Long id){
        this.layoutGridService.deleteLayoutGridById(id);
    }


    @PostMapping("{layoutGridId}/affectComponent/{componentId}")
    public LayoutGrid affectComponent(@PathVariable Long componentId,
                                     @PathVariable Long layoutGridId) {
        return layoutGridService.affectComponent( componentId, layoutGridId);
    }
    @PostMapping("{layoutGridId}/affectMessage/{messageId}")
    public LayoutGrid affectMessage(@PathVariable Long layoutGridId ,@PathVariable Integer messageId){
        return  layoutGridService.affectMessage(layoutGridId,messageId);
    }
    @PostMapping("{layoutGridId}/setComponents/{componentIds}")
    public LayoutGrid setComponents(@PathVariable List<Long> componentIds,
                                      @PathVariable Long layoutGridId) {
        return layoutGridService.setComponents( componentIds, layoutGridId);
    }

    @GetMapping("/findAllAudited")
    public ResponseEntity<List<LayoutGrid>> findAllAudited(){
        List<LayoutGrid> results = layoutGridService.getAllAudited();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

}

