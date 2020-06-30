package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.model.ComponentModel;

import com.pfe.dynamicsignage.service.ComponentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/Component")

public class ComponentController {

  @Autowired
    private ComponentService componentService;

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

}