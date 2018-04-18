/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.sql.Time;

/**
 *
 * @author Sagrek28
 */
public class Mensaje_Ejecucion extends Mensaje{
    
    //Atributos extra.
    
    private String texto_ejecucion;
    
    
    public Mensaje_Ejecucion(String usuario, String tipo_usario,String nombre_funcion) {
        super(usuario, tipo_usario,nombre_funcion);
        this.texto_ejecucion = "++ Ejecutandose... ++";
    }

    //Get y set
    
    public String getTexto_ejecucion() {
        return texto_ejecucion;
    }

    public void setTexto_ejecucion(String texto_ejecucion) {
        this.texto_ejecucion = texto_ejecucion;
    }
   

    @Override
    public String toString() {
        return   " - | " + this.texto_ejecucion + super.toString() ;
    }

}
