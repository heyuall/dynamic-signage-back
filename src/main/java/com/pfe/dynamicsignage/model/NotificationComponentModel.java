package com.pfe.dynamicsignage.model;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import lombok.Data;

import java.util.List;


@Data
public class NotificationComponentModel {
    private Long id;


    private String name;
    private List<String> data;
    private List<LayoutGrid> layoutGrids;

}
