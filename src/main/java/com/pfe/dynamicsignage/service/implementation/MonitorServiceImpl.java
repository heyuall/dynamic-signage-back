package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.MonitorDao;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import com.pfe.dynamicsignage.entity.Monitor;
import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.dto.MonitorDto;
import com.pfe.dynamicsignage.service.MonitorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonitorServiceImpl implements MonitorService {
    @Autowired
    private MonitorDao monitorDao;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LayoutGridDao layoutGridDao;

    public List<Monitor> getAll() {
        return monitorDao.findAll();
    }

    public Monitor addAfficheur(MonitorDto monitorDto) {
        Monitor monitor = modelMapper.map(monitorDto, Monitor.class);

        return monitorDao.save(monitor);
    }

    public Monitor affectLayoutGrid(Long afficheurId, Long layoutGridId) {
        Monitor monitor = monitorDao.findById(afficheurId).get();
       LayoutGrid layoutGrid= layoutGridDao.findById(layoutGridId).get();

       if (monitor.getLayoutGrid() ==null) {

           monitor.setLayoutGrid(layoutGrid);
       }else{
           monitor.setLayoutGrid(null);
           monitor.setLayoutGrid(layoutGrid);
       }
        return monitorDao.save(monitor);
    }

    public Optional<Monitor> findAfficheurById(Long id) {
        return this.monitorDao.findById(id);
    }

    public void deleteAfficheurById(Long id) {
        this.findAfficheurById(id).ifPresent(aff ->this.monitorDao.delete(aff));
    }

}
