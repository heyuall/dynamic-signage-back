package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.dto.ComponentDto;
import com.pfe.dynamicsignage.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonObject;
import java.util.ArrayList;
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
    public Component addComponent(@RequestBody final ComponentDto componentDto) {
        return componentService.addComponent(componentDto);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteComponentById(@PathVariable final Long id) {
        this.componentService.deleteComponentById(id);
    }


    @PostMapping("/create")
    public Component createcomponents() {
      List<Component> components = this.componentService.getAll();
       /* System.out.println("Message: "+components);*/
        ArrayList<JsonObject> jsonObjects = this.componentService.getComponentDatas();
        if (components.isEmpty()) {

            for (JsonObject e : jsonObjects) {
                componentService.createComponents(e);
            }
        }
        return null;
    }
}