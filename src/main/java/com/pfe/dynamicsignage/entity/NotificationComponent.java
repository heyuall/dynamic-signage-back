package com.pfe.dynamicsignage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class NotificationComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    @ElementCollection(targetClass=String.class)
    private List<String> data ;
    @OneToMany
    @JsonBackReference
    private List <LayoutGrid> layoutGrids;
}
