package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.ComponentDao;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.model.ComponentModel;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.ComponentService;
import com.pfe.dynamicsignage.service.LayoutGridService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LayoutGridServiceImpl implements LayoutGridService {
    @Autowired
    private LayoutGridDao layoutGridDao;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ComponentService componentService;
    @Autowired
    private ComponentDao componentDao;

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
        Component component =  componentDao.findById(componentId).get();

        if (layoutGrid.getComponentSet().isEmpty()) {
            Set<Component> components = new HashSet<>();
            components.add(component);
            layoutGrid.setComponentSet(components);
        } else {
            layoutGrid.getComponentSet().add(component);
        }
       return layoutGridDao.save(layoutGrid);
    }
}

