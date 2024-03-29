package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.ComponentDao;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import com.pfe.dynamicsignage.dao.MessageComponentDao;
import com.pfe.dynamicsignage.dao.NotificationComponentDao;
import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.entity.MessageComponent;
import com.pfe.dynamicsignage.entity.NotificationComponent;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.LayoutGridService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LayoutGridServiceImpl implements LayoutGridService {
    @Autowired
    private LayoutGridDao layoutGridDao;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ComponentDao componentDao;
    @Autowired
    private MessageComponentDao messageComponentDao;
    @Autowired
    private NotificationComponentDao notificationComponentDao;


    public List<LayoutGrid> getAll() {
        return layoutGridDao.findAll();
    }

    public LayoutGrid addLayoutGrid(LayoutGridModel layoutGridModel) {
        LayoutGrid layoutGrid = modelMapper.map(layoutGridModel, LayoutGrid.class);

        return layoutGridDao.save(layoutGrid);
    }

    @Override
    public void deleteLayoutGridById(Long id) {
        this.layoutGridDao.deleteById(id);
    }

    @Override
    public LayoutGrid affectComponent(Long componentId, Long layoutGridId) {

        LayoutGrid layoutGrid = layoutGridDao.findById(layoutGridId).get();
        Component component = componentDao.findById(componentId).get();

        if (layoutGrid.getComponents().isEmpty()) {
            List<Component> components = new ArrayList<>();
            components.add(component);
            layoutGrid.setComponents(components);
        } else {
            layoutGrid.getComponents().add(component);
        }
        return layoutGridDao.save(layoutGrid);
    }

    public LayoutGrid setComponents(List<Long> componentIds, Long layoutGridId) {

        LayoutGrid layoutGrid = layoutGridDao.findById(layoutGridId).get();
        List<Component>componentList= new ArrayList<>();
        for (int i =0; i<componentIds.size();i++) {
            componentList.add( componentDao.findById(componentIds.get(i)).get());
        }

            List<Component>componentsss= new ArrayList<>();
            layoutGrid.setComponents(componentsss);

            layoutGrid.setComponents(componentList);

        return layoutGridDao.save(layoutGrid);
    }

    @Override
    public LayoutGrid affectMessage(Long layoutGridId, Integer messageId) {
        LayoutGrid layoutGrid = layoutGridDao.findById(layoutGridId).get();
        MessageComponent messageComponent = messageComponentDao.findById(messageId).get();

        layoutGrid.setMessageComponent(messageComponent);

        return layoutGridDao.save(layoutGrid);

    }

    @Override
    public LayoutGrid affectNotification(Long layoutGridId, Long notificationId) {
        LayoutGrid layoutGrid = layoutGridDao.findById(layoutGridId).get();
        NotificationComponent notificationComponent = notificationComponentDao.findById(notificationId).get();
        layoutGrid.setNotificationComponent(notificationComponent);
        return layoutGridDao.save(layoutGrid);
    }
}

