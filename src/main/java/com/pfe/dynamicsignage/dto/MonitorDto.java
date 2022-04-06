package com.pfe.dynamicsignage.dto;

import lombok.Data;

@Data
public class MonitorDto {

    private Long id;
    private String name;
    private String afficheurReference ;

    private LayoutGridDto layoutGrid;

}
