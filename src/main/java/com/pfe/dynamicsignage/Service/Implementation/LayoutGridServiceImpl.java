package com.pfe.dynamicsignage.Service.Implementation;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Service.LayoutGridService;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayoutGridServiceImpl implements LayoutGridService {
    @Autowired
    private LayoutGridDao layoutGridDao;

    public List<LayoutGrid> getAll(){
        return  layoutGridDao.findAll();
    }

    public LayoutGrid addLayoutGrid(LayoutGrid layoutGrid) {

        return layoutGridDao.save(layoutGrid);
    }
}
