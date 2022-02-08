package com.pfe.dynamicsignage.controller;


import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.dto.MessageComponentDto;
import com.pfe.dynamicsignage.service.MessageComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/Message")
public class MessageComponentController {
@Autowired
    MessageComponentService messageComponentService;
    @GetMapping("/all")
    public List<MessageComponent> getAll() {
        return messageComponentService.getAll();
    }

    @PostMapping("/add")
    public MessageComponent addMessageComponent(@RequestBody final MessageComponentDto messageComponentDto) {
        return messageComponentService.addMessageComponent(messageComponentDto);
    }



    @DeleteMapping("/{id}")
    public void deleteMessageComponentById(@PathVariable final Integer id){
        this.messageComponentService.deleteMessageComponentById(id);
    }

    @PostMapping("/update")
    public MessageComponent updateMessageComponent(@RequestBody final MessageComponentDto messageComponentDto){
        return messageComponentService.updateMessageComponent(messageComponentDto);
    }

}
