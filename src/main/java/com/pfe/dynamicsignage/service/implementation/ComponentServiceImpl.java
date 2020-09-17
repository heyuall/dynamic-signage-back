package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.ComponentDao;
import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.model.ComponentModel;
import com.pfe.dynamicsignage.service.ComponentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComponentServiceImpl implements ComponentService {






    @Autowired
    private ComponentDao componentDao;
    @Autowired
    private ModelMapper modelMapper;

    public ArrayList<JsonObject> getComponentDatas() {
        //This the data got from web service
        List<JsonObject> datas;

        JsonObject obj1 = Json.createObjectBuilder()
                .add("title", "Production Atelier")
                .add("view", "pie")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 1000)
                        .add(Math.random() * 1000)
                        .add(Math.random() * 1000)
                ).build();
        JsonObject obj2 = Json.createObjectBuilder()
                .add("title", "Production Ligne1 par semaine")
                .add("view", "bar")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                ).build();

     /*   JsonObject obj2 = Json.createObjectBuilder()
                .add("title", "Production Atelier")
                .add("view", "bar")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 1000)
                        .add(Math.random() * 1000)
                        .add(Math.random() * 1000)
                ).build();
       */
        JsonObject obj3 = Json.createObjectBuilder()
                .add("title", "Production Ligne 1")
                .add("view", "gauge")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 1)

                ).build();
        JsonObject obj4 = Json.createObjectBuilder()
                .add("title", "Production Ligne 2")
                .add("view", "gauge")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 1)

                ).build();
        JsonObject obj5 = Json.createObjectBuilder()
                .add("title", "Production Ligne 3")
                .add("view", "gauge")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 1)

                ).build();
        JsonObject obj6 = Json.createObjectBuilder()
                .add("title", "Temperature")
                .add("view", "gauge")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 1)

                ).build();
        /*
        JsonObject obj7 = Json.createObjectBuilder()

                .add("title", "Humidité")
                .add("view", "dragger")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 1)

                ).build();
        JsonObject obj8 = Json.createObjectBuilder()
                .add("title", "Production Ligne1 par semaine")
                .add("view", "bar")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                ).build();
        JsonObject obj9 = Json.createObjectBuilder()
                .add("title", "Production Ligne2 par semaine")
                .add("view", "bar")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                ).build();
        JsonObject obj10 = Json.createObjectBuilder()
                .add("title", "Production Ligne3 par semaine")
                .add("view", "bar")
                .add("data", Json.createArrayBuilder()
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                        .add(Math.random() * 100 + 20)
                ).build();
  */

        datas = new ArrayList<JsonObject>();
        datas.add(obj1);
        datas.add(obj2);
        datas.add(obj3);
        datas.add(obj4);
        datas.add(obj5);
        datas.add(obj6);
       /* datas.add(obj7);
        datas.add(obj8);
        datas.add(obj9);
        datas.add(obj10);*/

        return (ArrayList<JsonObject>) datas;

    }
  @Override
    public Component createComponents(JsonObject jsonObject){
        ComponentModel componentModel = new ComponentModel();
        componentModel.setTitle(jsonObject.getString("title"));
        componentModel.setView(jsonObject.getString("view"));
        componentModel.setData((List<Double>) jsonObject.get("data"));

        Component component = modelMapper.map(componentModel, Component.class);
        return componentDao.save(component);
    }


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