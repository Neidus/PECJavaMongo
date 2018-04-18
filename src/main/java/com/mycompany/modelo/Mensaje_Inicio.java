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
public class Mensaje_Inicio extends Mensaje{
    
  
    //Atributos extra.
    
    private String texto_inicio;

    public Mensaje_Inicio(String usuario, String tipo_usario, String nombre_funcion) {
        super(usuario, tipo_usario,nombre_funcion);    
        this.texto_inicio = "** Inicio de la funcion... **";
    }

    public String getTexto_inicio() {
        return texto_inicio;
    }

    public void setTexto_inicio(String texto_inicio) {
        this.texto_inicio = texto_inicio;
    }

    @Override
    public String toString() {
        return " - | " + this.texto_inicio + super.toString() ;
    }

}
