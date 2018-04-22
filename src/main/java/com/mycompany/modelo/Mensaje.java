/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author Varela
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Mensaje {
    

	//Atributos.

    private String usuario;

    private String tipo_usuario;

    private String fecha;

    private String nombre_funcion;

    private String id_funcion;  // Formato especial --> "NombreFuncion_Timestamp"

    private String autor_funcion;  // Se establecen los tipos de argumentos de la función.
    
    private String tipo_mensaje;
    
    private String mensaje; // mensaje xD
    
    //Atributos para el mensaje de error
    private String texto_error;
    private String linea_error;
    
    //Atributos para el mensaje de fin
    private String duracion;
    
    //Atributos para el mensaje de warning
    private String texto_warning;


    //Contructor de la clase.

    public Mensaje(String usuario, String tipo_usuario,String nombre_funcion) {
        this.usuario = usuario;
        this.tipo_usuario = tipo_usuario;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
        this.fecha = dateFormat.format(date);  //Se inicializa para coger la hora del sistema.
        this.nombre_funcion = nombre_funcion;
        dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        this.id_funcion = this.nombre_funcion + "_" + dateFormat.format(date); 
        this.mensaje= "Ejecución de la funcion " + this.id_funcion + " a la hora "+this.fecha + " por el usuario " + this.usuario + " de tipo "+this.tipo_usuario + " nombre de la funcion " + this.nombre_funcion+ " autor de la funcion: "+this.autor_funcion+".";
        
    }
    
    public void setMensajeInicio() {
        this.tipo_mensaje= "Inicio";
        this.mensaje = "Inicio de ejecucion de la funcion " + this.nombre_funcion + " a la hora "+ this.fecha + " por el usuario " + this.usuario + 
                           " de tipo "+ this.tipo_usuario + ".";     
    }
    
    public void setMensajeFin(String duracion) {
        this.duracion = duracion;
        this.tipo_mensaje= "Fin";
        this.mensaje = "Fin de ejecucion de la funcion " + this.nombre_funcion + " a la hora "+ this.fecha + " por el usuario " + this.usuario + 
                           " de tipo "+ this.tipo_usuario + " de duracion total de la funcion " + this.duracion + " ms.";    
        
    
    }
    
    public void setMensajeError(String linea_error, String texto_error) {
        this.tipo_mensaje= "Error";
        this.texto_error = texto_error;
        this.linea_error = linea_error;
        this.mensaje = "Error en la ejecucion de la funcion " + this.nombre_funcion + " a la hora "+ this.fecha + " por el usuario " + this.usuario + 
                           " de tipo "+ this.tipo_usuario + " en la linea " + this.linea_error + " con el error :\n" + this.texto_error + ".";

    }
    
    public void setMensajeWarning(String texto_warning) {
        this.tipo_mensaje= "Warning";
        this.texto_warning = texto_warning;
        this.mensaje = "Aviso durante la ejecucion de la funcion " + this.nombre_funcion + " a la hora "+ this.fecha + " por el usuario " + this.usuario + 
                           " de tipo "+ this.tipo_usuario + " :\n" + this.texto_warning + ".";  
    }
    
    //Constructor vacío que necesita el mapeador de json jackson.
    public Mensaje() {
        
    }

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha= fecha;
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

    public String getAutor_funcion() {
        return autor_funcion;
    }

    public void setAutor_funcion(String autor_funcion) {
        this.autor_funcion = autor_funcion;
    }
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public String getTipo_mensaje() {
        return tipo_mensaje;
    }

    public void setTipo_mensaje(String tipo_mensaje) {
        this.tipo_mensaje = tipo_mensaje;
    }

    public String getTexto_error() {
        return texto_error;
    }

    public void setTexto_error(String texto_error) {
        this.texto_error = texto_error;
    }

    public String getLinea_error() {
        return linea_error;
    }

    public void setLinea_error(String linea_error) {
        this.linea_error = linea_error;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTexto_warning() {
        return texto_warning;
    }

    public void setTexto_warning(String texto_warning) {
        this.texto_warning = texto_warning;
    }
    
    
    
    

    @Override
    public String toString() {
        //return " -- [ " + this.hora.toString() + " ] - USER: '" + this.usuario + "' => " + this.tipo_usuario + " - ID: " + this.id_funcion + " - AUTOR: " + this.autor_funcion + " - Retorno: " + this.tipo_retorno;
        return "Este toString ahora mismo no funciona, con nulos da problemas, arreglar";
    }
    
    
}
