package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.dto.MessageComponentDto;

import java.util.List;
import java.util.Optional;

public interface MessageComponentService {
    public MessageComponent addMessageComponent(MessageComponentDto messageComponentDto);

    public List<MessageComponent> getAll();

    public void deleteMessageComponentById(Integer id);

    public Optional<MessageComponent> findMessageComponentById(Integer id);

    public MessageComponent updateMessageComponent(MessageComponentDto messageComponentDto);

}

