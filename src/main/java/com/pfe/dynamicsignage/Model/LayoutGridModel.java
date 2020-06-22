package com.pfe.dynamicsignage.Model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.pfe.dynamicsignage.Entity.Afficheur;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
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
