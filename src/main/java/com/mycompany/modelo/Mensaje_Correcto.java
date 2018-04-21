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
public class Mensaje_Correcto extends Mensaje{
    

	//Atributos extra.
    
    private String texto_correcto;

    public Mensaje_Correcto(String usuario, String tipo_usario, String nombre_funcion) {
        super(usuario, tipo_usario,nombre_funcion);
        this.texto_correcto = ":D La Ejecución de la Funcion Termino Correctamente";
    }

    public String getTexto_correcto() {
        return texto_correcto;
    }

    public void setTexto_correcto(String texto_correcto) {
        this.texto_correcto = texto_correcto;
    }
    
    
     @Override
    public String toString() {
        return  " - | " + this.texto_correcto + super.toString() ;
    }

}
