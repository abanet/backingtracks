package com.backingtrackstoimprovise.backingtracks.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "backingtrack")
public class Backingtrack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "url", nullable = false, length = 512)
    private String url;

    @Column(name = "fechaCatalogacion", nullable = false)
    private Date fechaCatalogacion;

    @Column(name = "bpm")
    private Integer bpm;

    @Column(name = "tono", length = 45)
    private String tono;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaCatalogacion() {
        return fechaCatalogacion;
    }

    public void setFechaCatalogacion(Date fechaCatalogacion) {
        this.fechaCatalogacion = fechaCatalogacion;
    }

    public Integer getBpm() {
        return bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }

}