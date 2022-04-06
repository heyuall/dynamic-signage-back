package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.dto.LayoutGridDto;

import java.util.List;

public interface LayoutGridService {
    public LayoutGrid addLayoutGrid(LayoutGridDto layoutGridDto);

    public List<LayoutGrid> getAll();

    public void deleteLayoutGridById(Long id);

    public LayoutGrid affectComponent(Long componentId, Long layoutGridId);

    public LayoutGrid affectMessage (Long layoutGridId , Integer MessageId);

    public LayoutGrid affectNotification (Long layoutGridId ,Long notificationId);

    public LayoutGrid setComponents(List<Long> componentIds ,Long layoutGridId);
}
