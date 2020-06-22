package com.pfe.dynamicsignage.Service.Implementation;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Model.LayoutGridModel;
import com.pfe.dynamicsignage.Service.LayoutGridService;
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
}
