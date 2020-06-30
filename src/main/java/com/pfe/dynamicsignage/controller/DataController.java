package com.pfe.dynamicsignage.controller;


import com.pfe.dynamicsignage.entity.Data;
import com.pfe.dynamicsignage.model.DataModel;
import com.pfe.dynamicsignage.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Data")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/all")
    public List<Data> getAll() {
        return dataService.getAll();
    }

    @PostMapping("/add")
    public Data addData ( @RequestBody final DataModel dataModel){
        return dataService.addData(dataModel);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteDataById(@PathVariable final Long id){
        this.dataService.deleteDataById(id);
    }

}
