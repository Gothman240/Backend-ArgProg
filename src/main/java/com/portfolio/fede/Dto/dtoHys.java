/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.fede.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    private String iconskill;

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String iconskill) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.iconskill = iconskill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getIconskill() {
        return iconskill;
    }

    public void setIconskill(String iconskill) {
        this.iconskill = iconskill;
    }
}
