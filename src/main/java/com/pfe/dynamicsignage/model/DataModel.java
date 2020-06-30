package com.pfe.dynamicsignage.model;

import com.pfe.dynamicsignage.entity.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataModel {

    private long id;
    private String description;
    private List<Double> data;
    private Set<Component> componentSet;
    private Set<com.pfe.dynamicsignage.entity.Data> dataSet;
}
