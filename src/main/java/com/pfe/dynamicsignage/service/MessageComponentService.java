package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.dto.MessageComponentDto;

import java.util.List;
import java.util.Optional;

public interface MessageComponentService {
    MessageComponent addMessageComponent(MessageComponentDto messageComponentDto);

    List<MessageComponent> getAll();

    void deleteMessageComponentById(Integer id);

    Optional<MessageComponent> findMessageComponentById(Integer id);

    MessageComponent updateMessageComponent(MessageComponentDto messageComponentDto);

}

