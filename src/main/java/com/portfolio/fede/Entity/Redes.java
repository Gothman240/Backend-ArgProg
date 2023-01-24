package com.portfolio.fede.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @NotNull
    private String url;

    private String iconRedes;

    public Redes() {
    }

    public Redes(String nombre, String url, String iconRedes) {
        this.nombre = nombre;
        this.url = url;
        this.iconRedes = iconRedes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
