/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import Persona.Paciente;
import java.util.Vector;

/**
 *
 * @author Fabricio
 */
public class ListaPacientes {
    private static Vector<Paciente> datos = new Vector<Paciente>();
         public static void agregar(Paciente obj){
        datos.addElement(obj);
        }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
        }
    public static  Vector mostrar(){
        return datos;
    }
}
