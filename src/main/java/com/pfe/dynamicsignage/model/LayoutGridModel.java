package com.pfe.dynamicsignage.model;

import lombok.Data;

import java.util.List;

@Data
public class LayoutGridModel {
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;
    private List<MonitorModel> afficheurs;

}
