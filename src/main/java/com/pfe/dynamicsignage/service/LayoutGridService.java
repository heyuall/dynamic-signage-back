package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import com.pfe.dynamicsignage.model.LayoutGridModel;

import java.util.List;

public interface LayoutGridService {
    public LayoutGrid addLayoutGrid(LayoutGridModel layoutGridModel);

    public List<LayoutGrid> getAll();

    public  void deleteLayoutGridById(Long id);
}