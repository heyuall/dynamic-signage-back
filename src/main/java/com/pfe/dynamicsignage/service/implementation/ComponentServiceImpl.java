package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.ComponentDao;
import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.model.ComponentModel;
import com.pfe.dynamicsignage.service.ComponentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComponentServiceImpl implements ComponentService {
    @Autowired
    private ComponentDao componentDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Component> getAll() {
        return componentDao.findAll();
    }

    public Component addComponent(ComponentModel componentModel) {
        Component component = modelMapper.map(componentModel, Component.class);

        return componentDao.save(component);
    }


    public Optional<Component> findComponentById(Long id) {
        return this.componentDao.findById(id);
    }

    public void deleteComponentById(Long id) {
        this.findComponentById(id).ifPresent(aff -> this.componentDao.delete(aff));
    }
}