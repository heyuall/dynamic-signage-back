package com.pfe.dynamicsignage.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayoutGrid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;
    @ManyToOne
    @JsonManagedReference
    private Afficheur afficheur;


}
