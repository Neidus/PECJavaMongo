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
public class Mensaje_Inicio extends Mensaje{
    
  
    
    public Mensaje_Inicio(String usuario, String tipo_usario, String nombre_funcion) {
        super(usuario, tipo_usario,nombre_funcion);  
        super.setTipo_mensaje("Inicio");
        super.setMensaje("Inicio de ejecucion de la funcion " + super.getNombre_funcion() + " a la hora "+ super.getHora() + " por el usuario " + super.getUsuario() + 
                           " de tipo "+ super.getTipo_usuario() + " nombre de la funcion " + super.getNombre_funcion() + " autor de la funcion: "+ super.getAutor_funcion() +  ".");
        
    }

   
    @Override
    public String toString() {
        return super.toString();
    }

}
