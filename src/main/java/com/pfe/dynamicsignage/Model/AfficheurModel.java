package com.pfe.dynamicsignage.Model;

import com.pfe.dynamicsignage.Entity.LayoutGrid;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class AfficheurModel {
    @NotBlank
    @NotNull
    private Long id;
    private String name;
    private String afficheurReference ;

    private LayoutGridModel layoutGrid;

}
