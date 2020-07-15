package com.pfe.dynamicsignage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
    @Column(name="_name")
    private String name;
    @Column(name="_main_dimension")
    private String main_dimension;
    @Column(name="_footer")
    private Boolean footer;
    @Column(name="_aside")
    private Boolean aside;
    @OneToMany
    @JsonBackReference
    private List<Monitor> monitors = new ArrayList<>();


    @ManyToMany(cascade = { CascadeType.ALL })

      /*@JoinTable(
             name = "layout_grid_component",
             joinColumns = { @JoinColumn(name = "layout_grid_id") },
             inverseJoinColumns = { @JoinColumn(name = "component_id") }
     )*/
    private Set<Component> componentSet = new HashSet<>();



}
