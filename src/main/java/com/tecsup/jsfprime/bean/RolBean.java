/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Rol;
import com.tecsup.jsfprime.model.Usuario;
import com.tecsup.jsfprime.service.GestionUsuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author PCC
 */
@ManagedBean
@RequestScoped
public class RolBean {
    
    private List<Rol> roles;
    private List<Usuario> usuarios;
    
    public RolBean(){
        GestionUsuario gestion = new GestionUsuario();
        this.roles=gestion.listar();
        
        System.out.println("TOTAL ROL " + this.roles.size());
    }
    
    public void cargarUsuarios(Long rol){
        GestionUsuario gestion = new GestionUsuario();
        this.usuarios = gestion.listarPorRol(rol);
        
        System.out.println("TOTAL USUARIOS " + this.usuarios.size());
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
