/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Rol;
import com.tecsup.jsfprime.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCC
 */
public class GestionUsuario {
    
    public List<Rol> listar(){
        List<Rol> roles = new ArrayList();
        
        roles.add(new Rol(1l,"Administrador"));
        roles.add(new Rol(2l,"Supervisor"));
        roles.add(new Rol(3l,"Terapeuta"));
        roles.add(new Rol(4l,"Apoderado"));
        
        return roles;
        
    }
    
    public List<Usuario> listarPorRol(Long id){
        List<Usuario> usuarios = new ArrayList();
        
        usuarios.add(new Usuario(1l,"David","Rodríguez","Condezo","rcondezo@gmail.com", new Rol(1l)));
        usuarios.add(new Usuario(2l,"Fidel","Matos","Perez","fidel@gmail.com", new Rol(2l)));
        usuarios.add(new Usuario(3l,"Gilmer","Guadalupe","Guadalupe","gdavidguadalupe@gmail.com", new Rol(3l)));
        usuarios.add(new Usuario(4l,"Wilson","Vinces","Gonzales","wvinces@gmail.com", new Rol(4l)));
        usuarios.add(new Usuario(5l,"José","Beraún","Rojas","jberaun@gmail.com", new Rol(3l)));
        usuarios.add(new Usuario(6l,"Aidé","Lopez","Díaz","alopez@gmail.com", new Rol(4l)));
        usuarios.add(new Usuario(7l,"Carlos","Zapata","Torres","czapata@gmail.com", new Rol(2l)));
        usuarios.add(new Usuario(8l,"Luis","Olano","Delgado","lolano@gmail.com", new Rol(1l)));
        
        List<Usuario> respuesta = new ArrayList();
        
        for (Usuario usuario : usuarios) {
            if(usuario.getRol().getId() == id.longValue()){
                respuesta.add(usuario);
            }
        }
        
        return respuesta;
        
    }
    
}
