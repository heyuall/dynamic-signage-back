package com.pfe.dynamicsignage.service;


import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.model.ComponentModel;

import java.util.List;
import java.util.Optional;

public interface ComponentService {
    public Component addComponent(ComponentModel componentModel);

    public List<Component> getAll();

    public void deleteComponentById(Long id);

    public Optional<Component> findComponentById(Long id);

}
