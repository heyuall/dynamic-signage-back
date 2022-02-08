package com.pfe.dynamicsignage.dto;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import lombok.Data;

import java.util.List;


@Data
public class NotificationComponentDto {
    private Long id;


    private String name;
    private List<String> data;
    private List<LayoutGrid> layoutGrids;

}
