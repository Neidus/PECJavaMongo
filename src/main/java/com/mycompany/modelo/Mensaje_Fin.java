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
public class Mensaje_Fin extends Mensaje{
    
      
    //Atributos extra.
    
    private String texto_fin;

    public Mensaje_Fin(String usuario, String tipo_usario, String nombre_funcion) {
        super(usuario, tipo_usario,nombre_funcion);
        this.texto_fin = "^^ Fin de la funcion ^^";
    }

    public String getTexto_fin() {
        return texto_fin;
    }

    public void setTexto_fin(String texto_fin) {
        this.texto_fin = texto_fin;
    }
    
    
     @Override
    public String toString() {
        return  " - | " + this.texto_fin + super.toString() ;
    }

    
}
