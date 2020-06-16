package com.pfe.dynamicsignage.Service;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.dao.LayoutGridDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayoutGridService {
    @Autowired
    private LayoutGridDao layoutGridDao;

    public List<LayoutGrid> getAll(){
        return (List<LayoutGrid>) layoutGridDao.findAll();
    }
    public String AddLayoutGrid(LayoutGrid layoutGrid) {
        if ( layoutGridDao.existsByname(layoutGrid.getName())) {
            return "Fail -> name is already taken!";
        }

        layoutGridDao.save(layoutGrid);

        return "LayoutGrid registred successfully";
    }
}
