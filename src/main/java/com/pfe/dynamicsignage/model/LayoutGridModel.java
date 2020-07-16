package com.pfe.dynamicsignage.model;

import com.pfe.dynamicsignage.entity.Component;
import com.pfe.dynamicsignage.entity.MessageComponent;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class LayoutGridModel {
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private String aside;

    private List<MonitorModel> Monitors;

    private List<ComponentModel> components;

    private MessageComponentModel messageComponent;

}
