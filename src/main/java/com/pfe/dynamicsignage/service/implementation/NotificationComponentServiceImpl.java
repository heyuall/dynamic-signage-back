package com.pfe.dynamicsignage.service.implementation;


import com.pfe.dynamicsignage.dao.NotificationComponentDao;
import com.pfe.dynamicsignage.entity.NotificationComponent;
import com.pfe.dynamicsignage.dto.NotificationComponentDto;
import com.pfe.dynamicsignage.service.NotificationComponentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationComponentServiceImpl implements NotificationComponentService {
    @Autowired
    private NotificationComponentDao notificationComponentDao;
    @Autowired
    private ModelMapper modelMapper;

    public ArrayList<JsonObject> getNotificationComponentDatas() {
        //This the data got from web service
        List<JsonObject> datas;

        JsonObject obj1 = Json.createObjectBuilder()
                .add("name", "Atelier")

                .add("data", Json.createArrayBuilder()
                        .add("Arrêt Planifié")
                        .add("Blockage")
                        .add("En progression")
                        .add("Fin série1")
                ).build();

        JsonObject obj2 = Json.createObjectBuilder()
                .add("name", "Ligne 1")

                .add("data", Json.createArrayBuilder()
                        .add("Arrêt Planifié")
                        .add("Blockage")
                        .add("En progression")
                        .add("Fin série1")
                ).build();
        JsonObject obj3 = Json.createObjectBuilder()
                .add("name", " Ligne 2")

                .add("data", Json.createArrayBuilder()
                        .add("Arrêt Planifié")
                        .add("Blockage")
                        .add("En progression")
                        .add("Fin série1")

                ).build();
        JsonObject obj4 = Json.createObjectBuilder()
                .add("name", "Ligne 3")

                .add("data", Json.createArrayBuilder()
                        .add("Arrêt Planifié")
                        .add("Blockage")
                        .add("En progression")
                        .add("Fin série1")

                ).build();
       

        datas = new ArrayList<JsonObject>();
        datas.add(obj1);
        datas.add(obj2);
        datas.add(obj3);
        datas.add(obj4);
        

        return (ArrayList<JsonObject>) datas;

    }

    public NotificationComponent createNotificationComponents(JsonObject jsonObject){
        NotificationComponentDto notificationComponentDto = new NotificationComponentDto();
        notificationComponentDto.setName(jsonObject.getString("name"));

        notificationComponentDto.setData((List<String>) jsonObject.get("data"));

        NotificationComponent notificationComponent = modelMapper.map(notificationComponentDto, NotificationComponent.class);
        return notificationComponentDao.save(notificationComponent);
    }


    public List<NotificationComponent> getAll() {
        return notificationComponentDao.findAll();
    }

    public NotificationComponent addNotificationComponent(NotificationComponentDto notificationComponentDto) {
        NotificationComponent notificationComponent = modelMapper.map(notificationComponentDto, NotificationComponent.class);

        return notificationComponentDao.save(notificationComponent);
    }

    public Optional<NotificationComponent> findNotificationComponentById(Long id) {
        return this.notificationComponentDao.findById(id);
    }

    public void deleteNotificationComponentById(Long id) {
        this.findNotificationComponentById(id).ifPresent(aff -> this.notificationComponentDao.delete(aff));
    }

}
