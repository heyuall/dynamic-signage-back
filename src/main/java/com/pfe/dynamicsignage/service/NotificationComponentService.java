package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.NotificationComponent;
import com.pfe.dynamicsignage.model.NotificationComponentModel;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@
public interface NotificationComponentService {
    public NotificationComponent addNotificationComponent(NotificationComponentModel notificationNotificationComponentModel);

    public List<NotificationComponent> getAll();

    public void deleteNotificationComponentById(Long id);

    public Optional<NotificationComponent> findNotificationComponentById(Long id);

    public NotificationComponent createNotificationComponents(JsonObject jsonObject);

    public ArrayList<JsonObject> getNotificationComponentDatas();

}
