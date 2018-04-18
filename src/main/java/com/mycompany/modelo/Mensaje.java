/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.util.Date;

/**
 *
 * @author Varela
 */
public class Mensaje {
    

	//Atributos.

    private String usuario;

    private String tipo_usuario;

    private Date hora;

    private String nombre_funcion;

    private String id_funcion;  // Formato especial --> "NombreFuncion_Timestamp"

    private String autor_funcion;  // Se establecen los tipos de argumentos de la función.

    private String tipo_retorno;



    //Contructor de la clase.

    public Mensaje(String usuario, String tipo_usuario,String nombre_funcion) {
        this.usuario = usuario;
        this.tipo_usuario = tipo_usuario;
        this.hora = new Date(System.currentTimeMillis());  //Se inicializa para coger la hora del sistema.
        this.nombre_funcion = nombre_funcion;
        this.id_funcion = this.nombre_funcion + "_" + this.hora.toString(); 
        this.autor_funcion = this.nombre_funcion + "_NULL"; //Estas funciones no tienen argumentos.
        this.tipo_retorno = "String";
    }

    //Get y  sets ...

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora= hora;
    }
    
    public String getNombre_funcion() {
        return nombre_funcion;
    }

    public void setNombre_funcion(String nombre_funcion) {
        this.nombre_funcion = nombre_funcion;
    }

    public String getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(String id_funcion) {
        this.id_funcion = id_funcion;
    }

    public String getTipo_retorno() {
        return tipo_retorno;
    }

    public void setTipo_retorno(String tipo_retorno) {
        this.tipo_retorno = tipo_retorno;
    }

    public String getAutor_funcion() {
        return autor_funcion;
    }

    public void setAutor_funcion(String autor_funcion) {
        this.autor_funcion = autor_funcion;
    }

    @Override
    public String toString() {
        return " -- [ " + this.hora.toString() + " ] - USER: '" + this.usuario + "' => " + this.tipo_usuario + " - ID: " + this.id_funcion + " - AUTOR: " + this.autor_funcion + " - Retorno: " + this.tipo_retorno + "\n";
    }
}
