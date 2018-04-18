/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.aplicacion;

import com.mycompany.modelo.Mensaje;
import com.mycompany.mongo.MongoDBSingleton;

/**
 *
 * @author Varela
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MongoDBSingleton mongo = MongoDBSingleton.getInstance();
        mongo.getTestdb();
        System.out.println("Empiezo el bucle");
     
        //Enviamos mensaje a la BD mensajesDB y a la coleccion mensajes
        //Es decir, para encontrarlo haremos en mongodb:
        //use mensajesDB
        //db.mensajes.find({usuario:"tuUsuario"})
        //mongo.SendMessage(m);
      //  System.out.println(username);
        int z=1;
        int aleatorio=0;
        for (int i=0; i<50; i++){
            aleatorio = (int) (Math.random() * 4) + 1;
            
            switch (aleatorio) {
                case 1: funcion1();  //Si es 1 Se ejecuta la función 1.  
                        break;
                case 2: funcion2(); 
                        break;
                case 3: funcion3(); 
                        break;
                case 4: funcion4(); 
                        break;
                default: System.out.println("ups no deberia estar aqui");
            }
        }
        
        System.out.println("Acabo el bucle");
    }
    
    public static void funcion1() {
        
    String username = System.getProperty("user.name");
     
    Mensaje m = new Mensaje(username,"ADMINISTRADOR","Funcion_1"); //Creamos el mensaje.

    System.out.println(m.toString());
    
    }
    public static void funcion2() {
        
    String username = System.getProperty("user.name");
     
    Mensaje m = new Mensaje(username,"USUARIO","Funcion_2"); //Creamos el mensaje.

    System.out.println(m.toString());

    }
    
    public static void funcion3() {

    String username = System.getProperty("user.name");
     
    Mensaje m = new Mensaje(username,"USUARIO_PRIVILEGIOS","Funcion_3"); //Creamos el mensaje.

    System.out.println(m.toString());
        
    }
    public static void funcion4() {

    String username = System.getProperty("user.name");
     
    Mensaje m = new Mensaje(username,"JEFE_PROYECTO","Funcion_4"); //Creamos el mensaje.

    System.out.println(m.toString());

    }
}
