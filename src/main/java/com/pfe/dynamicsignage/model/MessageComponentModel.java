package com.pfe.dynamicsignage.model;

import com.pfe.dynamicsignage.entity.LayoutGrid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageComponentModel  {

    private Integer id;

    private List<String> data;

    private List<LayoutGridModel> layoutGrids;

}
