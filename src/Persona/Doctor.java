/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CapaDatos.ListaDoctores;
import java.util.Vector;

/**
 *
 * @author Fabricio
 */
public class Doctor {
    private String ci;  //Carnet de Identidad
    private String nombre;
    private String apellidos;
    private boolean estado;
    private String usuario;
    private String contraseña;
    private String especialidad;
    private final String categoria ="doctor";

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     public static int buscarDoctor(String ci){
     Vector listaDoctores = ListaDoctores.mostrar();
         for (int i = 0; i < listaDoctores.size(); i++) {
             Doctor obj= (Doctor)listaDoctores.elementAt(i);
             if(obj.getCi().equals(ci) ){
                return  i;
             }
         }
     return -1;
     }
        public static int validarUsuarioDoctor(String user,String pass){
     Vector listaDoctores = ListaDoctores.mostrar();
         for (int i = 0; i < listaDoctores.size(); i++) {
             Doctor obj= (Doctor)listaDoctores.elementAt(i);
             if(obj.getUsuario().equals(user) && obj.getContraseña().equals(pass)){
                return  i;
             }
         }
     return -1;
     }
}

