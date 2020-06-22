package com.pfe.dynamicsignage.Service;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import com.pfe.dynamicsignage.Model.LayoutGridModel;

import java.util.List;

public interface LayoutGridService {
    public LayoutGrid addLayoutGrid(LayoutGridModel layoutGridModel);

    public List<LayoutGrid> getAll();
}
