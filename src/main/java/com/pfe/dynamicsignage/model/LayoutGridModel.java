package com.pfe.dynamicsignage.model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

import java.util.List;

@Data
public class LayoutGridModel {
    private long id;
    @NotBlank
    @NotNull
    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;
    private List<AfficheurModel> afficheurs;
}
