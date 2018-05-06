/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.aplicacion;

import com.mycompany.jersey.client.ConexionCliente;
import com.mycompany.modelo.Mensaje;
import com.mycompany.mongo.MongoDBSingleton;
import com.sun.jersey.api.client.Client;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Varela
 */
public class Aplicacion {

    ConexionCliente cliente = new ConexionCliente();
    /**
     * @param args the command line arguments
     */

    
    public void simularTrabajo() {
        System.out.println("Empiezo el bucle");
        int aleatorio=0;
        for (int i=0; i<100; i++){
            aleatorio = (int) (Math.random() * 3) + 1;
            System.out.println("Aleatorio: "+ aleatorio);
            switch (aleatorio) {
                case 1: divisionSencilla();  //Si es 1 Se ejecuta la función 1.  
                        break;
                case 2: posicionLiga(); 
                        break;
                case 3: funcionLarga(); 
                        break;
                default: System.out.println("ups no deberia estar aqui");
            }
        }
        
        System.out.println("Acabo el bucle");
    }

    public void funcionMia() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
       
        
        Mensaje m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
        m.setMensajeInicio();
        cliente.postRequest(m);
        
        m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
        m.setMensajeFin(12);
        cliente.postRequest(m);
        
        m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
        m.setMensajeWarning("Este es el mensaje del warning");
        cliente.postRequest(m);
        
        
        
        
       
        
        try {
            int errorProvocado= 1/0;
        } catch (Exception e) {
            m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
            m.setMensajeError(Integer.toString(e.getStackTrace()[1].getLineNumber()), e.toString());
            cliente.postRequest(m); 
        }
        
        
    }
    
    //Esta función fallará a veces a propósito de forma aleatoria
    
    public float divisionSencilla() {
        long start_time = System.currentTimeMillis();

        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Mensaje m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
        m.setMensajeInicio();
        cliente.postRequest(m);
        
         float calculo = 0;
         int aleatorio = (int) (Math.random() * 10);  //Aletorio del 1 al 100

         try
         {
            calculo = 10/aleatorio;  //Excepcion division por cero.
            
            
            long end_time = System.currentTimeMillis();
            long difference = end_time-start_time;
            m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
            m.setMensajeFin((int) difference);
            cliente.postRequest(m);
        

         }
         catch(Exception e)
         {
            m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
            m.setMensajeError(Integer.toString(e.getStackTrace()[1].getLineNumber()), e.toString());
            cliente.postRequest(m); 
         }
         
         return calculo;
     
    }

    public int posicionLiga() {

        long start_time = System.currentTimeMillis();

        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Mensaje m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
        m.setMensajeInicio();
        cliente.postRequest(m);

         int posicionLiga = (int) (Math.random() * 20)+1;  //Aletorio del 1 al 100
         
         if (posicionLiga>=18) {
            m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
            m.setMensajeWarning("Aviso: El equipo acabaría en la posición " + posicionLiga + " que implicaria su descenso");
            cliente.postRequest(m);
         }
         
            long end_time = System.currentTimeMillis();
            long difference = end_time-start_time;
            m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
            m.setMensajeFin((int) difference);
            cliente.postRequest(m);
    
         return posicionLiga;
    }
    
    public void funcionLarga() {
        long start_time = System.currentTimeMillis();

        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Mensaje m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
        m.setMensajeInicio();
        cliente.postRequest(m);
        
        try {
            int tiempoEspera = (int) (Math.random() * 50) + 1;
            
            Thread.sleep(tiempoEspera); 
            
            long end_time = System.currentTimeMillis();
            long difference = end_time-start_time;
            
            if (difference>45) {
                m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
                m.setMensajeWarning("Aviso: La función ha tardado en exceso en ejecutarse (" + difference + ")");
                cliente.postRequest(m);
            }
            
            m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
            m.setMensajeFin((int) difference);
            cliente.postRequest(m);
            
            
        } catch (InterruptedException ex) {
            m = new Mensaje(System.getProperty("user.name"),"Comercial", ste[1].getMethodName());
            m.setMensajeError(Integer.toString(ex.getStackTrace()[1].getLineNumber()), ex.toString());
            cliente.postRequest(m); 
        }

        
    }

}
