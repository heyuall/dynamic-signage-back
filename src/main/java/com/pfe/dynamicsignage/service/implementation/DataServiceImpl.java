package com.pfe.dynamicsignage.service.implementation;

import com.pfe.dynamicsignage.dao.DataDao;
import com.pfe.dynamicsignage.entity.Data;
import com.pfe.dynamicsignage.model.DataModel;
import com.pfe.dynamicsignage.service.DataService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataDao dataDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Data> getAll() {
        return dataDao.findAll();
    }

    public Data addData(DataModel dataModel) {
        Data data = modelMapper.map(dataModel, Data.class);

        return dataDao.save(data);
    }


    public Optional<Data> findDataById(Long id) {
        return this.dataDao.findById(id);
    }

    public void deleteDataById(Long id) {
        this.findDataById(id).ifPresent(aff -> this.dataDao.delete(aff));
    }

}
