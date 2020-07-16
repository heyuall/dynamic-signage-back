package com.pfe.dynamicsignage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.pfe.dynamicsignage.model.LayoutGridModel;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MessageComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ElementCollection(targetClass=String.class)
    private List<String> data;

    @OneToMany
    @JsonBackReference
    private List <LayoutGrid> layoutGrids;
}
