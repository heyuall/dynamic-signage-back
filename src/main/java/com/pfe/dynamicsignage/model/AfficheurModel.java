package com.pfe.dynamicsignage.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AfficheurModel {
    @NotBlank
    @NotNull
    private Long id;
    private String name;
    private String afficheurReference ;

    private LayoutGridModel layoutGrid;

}
