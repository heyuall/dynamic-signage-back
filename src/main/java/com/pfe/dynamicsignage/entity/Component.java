package com.pfe.dynamicsignage.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
/*@Table(name = "component")*/
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type; // chart - message
    private String view;// histo - pie

    @ManyToMany(mappedBy = "componentSet")
    private Set<LayoutGrid> layoutGridSet ;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<com.pfe.dynamicsignage.entity.Data> dataSet;


}
