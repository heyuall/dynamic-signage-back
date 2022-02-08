package com.pfe.dynamicsignage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponentDto {

    private long id;

    private String title;
    private String view;// histo - pie

    private List <Double>  data ;
    private LayoutGridDto layoutGridSet ;

}
