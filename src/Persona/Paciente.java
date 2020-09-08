/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CapaDatos.ListaPacientes;
import java.util.Vector;

/**
 *
 * @author Fabricio
 */
public class Paciente {

    private String ci;  //documento de identidad;
    private String nombre;
    private String apellidos;
    private boolean estado;
    private String usuario;
    private String contraseña;
    private String gruposanguineo;
    private String enfermedad;
    private final String categoria = "paciente";

    public String getGruposanguineo() {
        return gruposanguineo;
    }

    public void setGruposanguineo(String gruposanguineo) {
        this.gruposanguineo = gruposanguineo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
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

    public static int buscarPaciente(String ci) {
        Vector listaPacientes = ListaPacientes.mostrar();
        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente obj = (Paciente) listaPacientes.elementAt(i);
            if (obj.getCi().equals(ci)) {
                return i;
            }
        }
        return -1;
    }

    public static int validarUsuarioPaciente(String user, String pass) {
        Vector listaPacientes = ListaPacientes.mostrar();
        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente obj = (Paciente) listaPacientes.elementAt(i);
            if (obj.getUsuario().equals(user) && obj.getContraseña().equals(pass)) {
                return i;
            }
        }
        return -1;
    }
    
}
