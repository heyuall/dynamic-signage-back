package com.pfe.dynamicsignage.service;


import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.dto.ComponentDto;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ComponentService {
    public Component addComponent(ComponentDto componentDto);

    public List<Component> getAll();

    public void deleteComponentById(Long id);

    public Optional<Component> findComponentById(Long id);

    public Component createComponents(JsonObject jsonObject);

    public ArrayList<JsonObject> getComponentDatas();

}
