package com.pfe.dynamicsignage.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class LayoutGrid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;


}
