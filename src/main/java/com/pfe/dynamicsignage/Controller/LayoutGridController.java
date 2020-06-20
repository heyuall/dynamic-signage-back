package com.pfe.dynamicsignage.Controller;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Service.LayoutGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/LayoutGrid")

public class LayoutGridController {
    @Autowired
    private LayoutGridService layoutGridService;

    @GetMapping("/all")
    public List<LayoutGrid> getAll() {
        return layoutGridService.getAll();
    }

}

