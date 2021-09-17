/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policine;

/**
 *
 * @author Usuario
 */
public class Usuario {

    String nombre;
    String apellido;
    String cedula;

    public Usuario(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String toString(){
        return "\nNombre Cliente: "+nombre+"Apellido Cliente: "+apellido+"Cedula Cliente: "+cedula;
    }
}
