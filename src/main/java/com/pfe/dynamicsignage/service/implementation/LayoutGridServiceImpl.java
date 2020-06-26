package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import com.pfe.dynamicsignage.service.LayoutGridService;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayoutGridServiceImpl implements LayoutGridService {
    @Autowired
    private LayoutGridDao layoutGridDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<LayoutGrid> getAll(){
        return  layoutGridDao.findAll();
    }

    public LayoutGrid addLayoutGrid(LayoutGridModel layoutGridModel) {
      LayoutGrid layoutGrid = modelMapper.map(layoutGridModel,LayoutGrid.class);

        return layoutGridDao.save(layoutGrid);
    }

    @Override
    public void deleteLayoutGridById(Long id) {
        this.layoutGridDao.deleteById(id);
    }
}
