package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.model.MessageComponentModel;

import java.util.List;
import java.util.Optional;

public interface MessageComponentService {
    public MessageComponent addMessageComponent(MessageComponentModel messageComponentModel);

    public List<MessageComponent> getAll();

    public void deleteMessageComponentById(Integer id);

    public Optional<MessageComponent> findMessageComponentById(Integer id);

    public MessageComponent updateMessageComponent(MessageComponentModel messageComponentModel);

}

