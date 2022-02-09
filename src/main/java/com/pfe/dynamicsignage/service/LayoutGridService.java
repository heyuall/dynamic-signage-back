package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.dto.LayoutGridDto;

import java.util.List;

public interface LayoutGridService {
    LayoutGrid addLayoutGrid(LayoutGridDto layoutGridDto);

    List<LayoutGrid> getAll();

    void deleteLayoutGridById(Long id);

    LayoutGrid affectComponent(Long componentId, Long layoutGridId);

    LayoutGrid affectMessage(Long layoutGridId, Integer MessageId);

    LayoutGrid affectNotification(Long layoutGridId, Long notificationId);

    LayoutGrid setComponents(List<Long> componentIds, Long layoutGridId);

    List<LayoutGrid> getAllAudited();
}
