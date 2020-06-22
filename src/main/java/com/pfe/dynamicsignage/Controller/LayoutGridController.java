package com.pfe.dynamicsignage.Controller;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Model.LayoutGridModel;
import com.pfe.dynamicsignage.Service.LayoutGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

}

