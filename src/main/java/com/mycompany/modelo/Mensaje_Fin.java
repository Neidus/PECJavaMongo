/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.sql.Time;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author Sagrek28
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Mensaje_Fin extends Mensaje{
    
      
    //Atributos extra.
    
    private int duracion;

    public Mensaje_Fin(String usuario, String tipo_usario, String nombre_funcion, int duracion) {
        super(usuario, tipo_usario,nombre_funcion);
        super.setTipo_mensaje("Fin");
        this.duracion = duracion;
        super.setMensaje("Fin de ejecucion de la funcion " + super.getNombre_funcion() + " a la hora "+ super.getHora() + " por el usuario " + super.getUsuario() + 
                           " de tipo "+ super.getTipo_usuario() + " de duracion total de la funcion " + this.duracion + " ms.");
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
     @Override
    public String toString() {
        return super.toString();
    }
        

    
}
