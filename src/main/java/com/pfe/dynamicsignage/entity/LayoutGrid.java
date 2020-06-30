package com.pfe.dynamicsignage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
/*@Table(name = "layout_grid")*/
public class LayoutGrid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;
    @OneToMany
    @JsonBackReference
    private List<Afficheur> afficheurs;


    @ManyToMany(fetch = FetchType.LAZY)
     /* @JoinTable(
             name = "layout_grid_component",
             joinColumns = { @JoinColumn(name = "layout_grid_id") },
             inverseJoinColumns = { @JoinColumn(name = "component_id") }
     )*/
    private Set<Component> componentSet ;



}
