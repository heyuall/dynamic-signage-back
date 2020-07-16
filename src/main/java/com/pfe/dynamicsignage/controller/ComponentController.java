package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.model.ComponentModel;

import com.pfe.dynamicsignage.service.ComponentService;

import com.pfe.dynamicsignage.service.implementation.ComponentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/api/Component")

public class ComponentController {

  @Autowired
    private ComponentService componentService;
@Autowired
private ComponentServiceImpl componentServiceImpl;
    @GetMapping("/all")
    public List<Component> getAll() {
        return componentService.getAll();
    }

    @PostMapping("/add")
    public Component addComponent ( @RequestBody final ComponentModel componentModel){
        return componentService.addComponent(componentModel);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteComponentById(@PathVariable final Long id){
        this.componentService.deleteComponentById(id);
    }





    @PostMapping("/create")
    public Component createcomponents (){
        ArrayList<JsonObject> jsonObjects = this.componentService.getComponentDatas();
        for(JsonObject e: jsonObjects){
         componentService.createComponents(e);
        }
        return null;
    }
}