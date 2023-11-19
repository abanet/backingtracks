package com.backingtrackstoimprovise.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "titulo", nullable = false, length = 256)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 5000)
    private String descripcion;

    @Column(name = "idVideo")
    private String idVideo;

    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;

    @Column(name = "aprobado")
    private Boolean aprobado;

    @Column(name = "urlImagen", length = 1024)
    private String urlImagen;

}