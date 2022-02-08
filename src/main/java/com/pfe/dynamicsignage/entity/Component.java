package com.pfe.dynamicsignage.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
/*@Table(name = "component")*/
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String view;// histo - pie

    @ElementCollection(targetClass=Double.class)
    private List <Double>  data ;

  /*  @ManyToOne(fetch = FetchType.LAZY)

    @JsonBackReference
    private LayoutGrid layoutGrid;
*/



}
