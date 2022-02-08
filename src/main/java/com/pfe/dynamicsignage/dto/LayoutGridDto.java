package com.pfe.dynamicsignage.dto;

import lombok.Data;

import java.util.List;

@Data
public class LayoutGridDto {
    private long id;

    private String name;
    private String main_dimension;
    private Boolean footer;
    private String aside;

    private List<MonitorDto> Monitors;

    private List<ComponentDto> components;

    private MessageComponentDto messageComponent;

}
