package com.pfe.dynamicsignage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageComponentDto {

    private Integer id;

    private List<String> data;

    private List<LayoutGridDto> layoutGrids;

}
