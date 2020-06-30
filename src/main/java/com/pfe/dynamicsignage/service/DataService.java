package com.pfe.dynamicsignage.service;

import com.pfe.dynamicsignage.entity.Data;
import com.pfe.dynamicsignage.model.DataModel;

import java.util.List;
import java.util.Optional;

public interface DataService {
    public Data addData(DataModel dataModel);

    public List<Data> getAll();

    public void deleteDataById(Long id);

    public Optional<Data> findDataById(Long id);
}
