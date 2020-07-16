package com.pfe.dynamicsignage.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class MonitorModel {

    private Long id;
    private String name;
    private String afficheurReference ;

    private LayoutGridModel layoutGrid;

}
