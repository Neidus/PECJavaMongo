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
        String username = System.getProperty("user.name");
        Mensaje m = new Mensaje(System.getProperty("user.name"));
        //Enviamos mensaje a la BD mensajesDB y a la coleccion mensajes
        //Es decir, para encontrarlo haremos en mongodb:
        //use mensajesDB
        //db.mensajes.find({usuario:"tuUsuario"})
        mongo.SendMessage(m);
        System.out.println(username);
        int z=1;
        int aleatorio=0;
        for (int i=0; i<50000; i++){
            aleatorio = (int) (Math.random() * 4) + 1;
            
            switch (aleatorio) {
                case 1: ; break;
                case 2: ; break;
                case 3: ; break;
                case 4: ; break;
                default: System.out.println("ups no deberia estar aqui");
            }
        }
        
        System.out.println("Acabo el bucle");
    }
    
    public void funcion1() {
        
    }
    public void funcion2() {
        
    }
    
    public void funcion3() {
        
    }
    public void funcion4() {
        
    }
    
    
}
