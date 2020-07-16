package com.pfe.dynamicsignage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pfe.dynamicsignage.model.MessageComponentModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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

    private String name;

    private String main_dimension;

    private Boolean footer;

    private String aside;
    @OneToMany
    @JsonBackReference
    private List<Monitor> monitors ;


    @OneToMany

      /*@JoinTable(
             name = "layout_grid_component",
             joinColumns = { @JoinColumn(name = "layout_grid_id") },
             inverseJoinColumns = { @JoinColumn(name = "component_id") }
     )*/
    @JsonManagedReference
    @NotFound(action = NotFoundAction.IGNORE)
   /* private Set<Component> componentSet = new HashSet<>();*/
    private  List <Component> components ;

    @ManyToOne
    @JsonManagedReference
    @NotFound(action = NotFoundAction.IGNORE)
    private MessageComponent messageComponent;

    @ManyToOne
    @JsonManagedReference
    @NotFound(action = NotFoundAction.IGNORE)
    private NotificationComponent notificationComponent;

}
