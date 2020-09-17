package com.pfe.dynamicsignage.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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

    private String title;
    private String view;// histo - pie

    @ElementCollection(targetClass=Double.class)
    private List <Double>  data ;

  /*  @ManyToOne(fetch = FetchType.LAZY)

    @JsonBackReference
    private LayoutGrid layoutGrid;
*/



}
