package com.pfe.dynamicsignage.Model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LayoutGridModel {
    private long id;
    @NotBlank
    @NotNull
    private String name;
    private String main_dimension;
    private Boolean footer;
    private Boolean aside;
}
