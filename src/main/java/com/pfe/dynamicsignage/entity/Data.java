package com.pfe.dynamicsignage.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;

    @ElementCollection(targetClass=Double.class)
    private   List <Double> data ;

    @ManyToMany(mappedBy = "dataSet")
    private Set<Component> componentSet ;

}
