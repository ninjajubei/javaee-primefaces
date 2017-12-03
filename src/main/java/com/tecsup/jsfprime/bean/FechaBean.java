/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author PCC
 */
@ManagedBean(name="fechaBean")
@RequestScoped
public class FechaBean {
    
    private Date fecha;
    private String fechaMinima;
    private String fechaMaxima;

    public FechaBean() {
        
        fechaMinima="2017-12-03";
        fechaMaxima="2017-12-17";
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaMinima() {
        return fechaMinima;
    }

    public void setFechaMinima(String fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    public String getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }
    
}
