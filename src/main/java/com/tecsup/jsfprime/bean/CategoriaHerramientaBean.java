/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Categoria;
import com.tecsup.jsfprime.service.GestionCategoria;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author gdavi
 */

@ManagedBean
@RequestScoped
public class CategoriaHerramientaBean {
    
    private List<Categoria> categorias;

    public CategoriaHerramientaBean() {
        GestionCategoria gestion = new GestionCategoria();
        this.categorias=gestion.listar();
        
        System.out.println("TOTAL CATEGORIA  " + this.categorias.size());
        
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    
    
    
}
