/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.model;

/**
 *
 * @author PCC
 */
public class Rol {

    private Long id;
    private String descripcion;

    public Rol(Long id) {
        this.id = id;
    }

    public Rol(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Rol() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
