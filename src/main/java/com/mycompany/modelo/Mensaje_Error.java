/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author Sagrek28
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Mensaje_Error extends Mensaje{

	 //Atributos extra.
    
    private String texto_error;

    public Mensaje_Error(String usuario, String tipo_usario, String nombre_funcion, String texto_error, String mensaje) {
        super(usuario, tipo_usario,nombre_funcion, mensaje);
        this.texto_error = ":( !!! ERROR: " + texto_error;
    }

    public String getTexto_error() {
        return texto_error;
    }

    public void setTexto_error(String texto_errortexto_error) {
        this.texto_error = texto_error;
    }
    
    
     @Override
    public String toString() {
        return  " - | " + this.texto_error + super.toString() ;
    }

    
}
