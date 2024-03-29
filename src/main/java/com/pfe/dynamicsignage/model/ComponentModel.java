package com.pfe.dynamicsignage.model;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponentModel {

    private long id;

    private String title;
    private String view;// histo - pie

    private List <Double>  data ;
    private LayoutGridModel layoutGridSet ;

}
