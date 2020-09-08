/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import Persona.Doctor;

import java.util.Vector;

/**
 *
 * @author Fabricio
 */
public class ListaDoctores {
        private static Vector<Doctor> datos = new Vector<Doctor>();
         public static void agregar(Doctor  obj){
        datos.addElement(obj);
        }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
        }
    public static  Vector mostrar(){
        return datos;
    }
}
