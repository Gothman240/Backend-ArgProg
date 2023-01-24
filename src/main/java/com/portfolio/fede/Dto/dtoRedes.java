package com.portfolio.fede.Dto;

import javax.validation.constraints.NotBlank;

public class dtoRedes {

    private String nombre;
    @NotBlank
    private String url;

    private String iconRedes;

    public dtoRedes() {
    }

    public dtoRedes(String nombre, String url, String iconRedes) {
        this.nombre = nombre;
        this.url = url;
        this.iconRedes = iconRedes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIconRedes() {
        return iconRedes;
    }

    public void setIconRedes(String iconRedes) {
        this.iconRedes = iconRedes;
    }
}
