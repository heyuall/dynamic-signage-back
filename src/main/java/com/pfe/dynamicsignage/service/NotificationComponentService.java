package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.NotificationComponent;
import com.pfe.dynamicsignage.dto.NotificationComponentDto;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface NotificationComponentService {
    NotificationComponent addNotificationComponent(NotificationComponentDto notificationNotificationComponentDto);

    List<NotificationComponent> getAll();

    void deleteNotificationComponentById(Long id);

    Optional<NotificationComponent> findNotificationComponentById(Long id);

    NotificationComponent createNotificationComponents(JsonObject jsonObject);

    ArrayList<JsonObject> getNotificationComponentDatas();

}
