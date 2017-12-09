/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gdavi
 */
public class GestionCategoria {
    
    public List<Categoria> listar(){
        List<Categoria> categorias = new ArrayList();
        
        categorias.add(new Categoria(1l,"Alta Presion","Herramientas que funcionan a altas presiones de uso industrial"));
        categorias.add(new Categoria(2l,"Batería","Herramientas que son usadas a altas presiones de uso industrial"));
        categorias.add(new Categoria(3l,"Clásicas","Herramientas más conocidas de uso cotidiano"));
        categorias.add(new Categoria(4l,"Eléctricas","Herramientas que funcionan con electricidad"));
        categorias.add(new Categoria(5l,"Gasolina","Herramientas que funcionan a gasolina"));
        categorias.add(new Categoria(6l,"Neumáticas","Herramientas que funcionan con aire comprimido"));
        
        return categorias;
    }
    
}
