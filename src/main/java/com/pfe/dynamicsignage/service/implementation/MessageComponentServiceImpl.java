package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.MessageComponentDao;
import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.model.MessageComponentModel;
import com.pfe.dynamicsignage.service.MessageComponentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageComponentServiceImpl implements MessageComponentService {
    @Autowired
private MessageComponentDao messageComponentDao;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MessageComponent addMessageComponent(MessageComponentModel messageComponentModel) {
       MessageComponent messageComponent = modelMapper.map(messageComponentModel,MessageComponent.class);
       return messageComponentDao.save(messageComponent);
    }

    @Override
    public List<MessageComponent> getAll() {
        return messageComponentDao.findAll();
    }

    @Override
    public void deleteMessageComponentById(Integer id) {
        this.findMessageComponentById(id).ifPresent(aff ->this.messageComponentDao.delete(aff));

    }

    @Override
    public Optional<MessageComponent> findMessageComponentById(Integer id) {
        return this.messageComponentDao.findById(id);
    }

    @Override
    public MessageComponent updateMessageComponent(MessageComponentModel messageComponentModel){
        if (this.getAll().isEmpty()){
            return this.addMessageComponent(messageComponentModel);
        }else{
           this.findMessageComponentById(1).ifPresent(messageComponent ->
                   messageComponent.setData(messageComponentModel.getData()));
           //return this.findMessageComponentById(4).get();
           return messageComponentDao.save(this.findMessageComponentById(1).get());
        }
    }


}
