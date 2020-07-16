package com.pfe.dynamicsignage.controller;

import com.pfe.dynamicsignage.entity.NotificationComponent;
import com.pfe.dynamicsignage.model.NotificationComponentModel;
import com.pfe.dynamicsignage.service.NotificationComponentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/api/NotificationComponent")

public class NotificationComponentController {

    @Autowired
    private NotificationComponentService notificationComponentService;

    @GetMapping("/all")
    public List<NotificationComponent> getAll() {
        return notificationComponentService.getAll();
    }

    @PostMapping("/add")
    public NotificationComponent addNotificationComponent ( @RequestBody final NotificationComponentModel notificationComponentModel){
        return notificationComponentService.addNotificationComponent(notificationComponentModel);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteNotificationComponentById(@PathVariable final Long id){
        this.notificationComponentService.deleteNotificationComponentById(id);
    }





    @PostMapping("/create")
    public NotificationComponent createNotificationComponents (){
        ArrayList<JsonObject> jsonObjects = this.notificationComponentService.getNotificationComponentDatas();
        for(JsonObject e: jsonObjects){
            notificationComponentService.createNotificationComponents(e);
        }
        return null;
    }
}