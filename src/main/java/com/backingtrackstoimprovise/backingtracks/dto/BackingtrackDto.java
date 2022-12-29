package com.backingtrackstoimprovise.backingtracks.dto;

import lombok.Data;
import java.util.Date;

@Data
public class BackingtrackDto {

    private Integer id;
    private String titulo;
    private String url;
    private Date fechaCatalogacion;
    private Integer bpm;
    private String tono;
    private Integer puntuacion;

}
