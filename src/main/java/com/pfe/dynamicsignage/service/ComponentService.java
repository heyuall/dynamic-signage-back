package com.pfe.dynamicsignage.service;


import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.dto.ComponentDto;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ComponentService {
    Component addComponent(ComponentDto componentDto);

    List<Component> getAll();

    void deleteComponentById(Long id);

    Optional<Component> findComponentById(Long id);

    Component createComponents(JsonObject jsonObject);

    ArrayList<JsonObject> getComponentDatas();

}
