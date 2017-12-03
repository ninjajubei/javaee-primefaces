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
public class Usuario {

    private Long id;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String correo;
    private Rol rol;

    public Usuario(Long id, String nombres, String apePaterno, String apeMaterno, String correo, Rol rol) {
        this.id = id;
        this.nombres = nombres;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.correo = correo;
        this.rol = rol;

    }

    public Usuario(Long id, String nombres, String apePaterno, String apeMaterno, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.correo = correo;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
