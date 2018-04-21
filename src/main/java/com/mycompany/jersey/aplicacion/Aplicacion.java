/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.aplicacion;

import com.mycompany.jersey.client.ConexionCliente;
import com.mycompany.modelo.Mensaje;
import com.mycompany.modelo.Mensaje_Correcto;
import com.mycompany.modelo.Mensaje_Ejecucion;
import com.mycompany.modelo.Mensaje_Error;
import com.mycompany.modelo.Mensaje_Inicio;
import com.mycompany.modelo.Mensaje_Fin;
import com.mycompany.mongo.MongoDBSingleton;
import com.sun.jersey.api.client.Client;
import java.util.HashSet;

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
        for (int i=0; i<20; i++){
            aleatorio = (int) (Math.random() * 4) + 1;
            System.out.println("Aleatorio: "+ aleatorio);
            switch (aleatorio) {
                case 1: funcionMia();  //Si es 1 Se ejecuta la función 1.  
                        break;
                case 2: //funcion2(); 
                        break;
                case 3: //funcion3(); 
                        break;
                case 4: //funcion4(); 
                        break;
                default: System.out.println("ups no deberia estar aqui");
            }
        }
        
        System.out.println("Acabo el bucle");
    }

    public void funcionMia() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Mensaje m = new Mensaje(System.getProperty("user.name"),"Usuario Final", ste[1].getMethodName());
        cliente.postRequest(m);
        
    }
    
    public void funcion1() {
     
        String mensaje_completo = "";

        String username = System.getProperty("user.name");
         
        Mensaje_Inicio m_i = new Mensaje_Inicio(username,"ADMINISTRADOR","Funcion_1"); //Creamos el mensaje de inicio.

        System.out.println(m_i.toString());


         float calculo = 0;

         int aleatorio = (int) (Math.random() * 100);  //Aletorio del 1 al 100

         try
         {
            calculo = 10/aleatorio;  //Excepcion division por cero.
            
            if(aleatorio == 78) 
            {
                Mensaje m_nulo = null;

                m_nulo.toString(); //Excepcion accedemos a un objeto vacío.
            }
            
            
            Mensaje_Ejecucion m_e = new Mensaje_Ejecucion(username,"ADMINISTRADOR","Funcion_1");

            System.out.println(m_e.toString());

            Mensaje_Fin m_f = new Mensaje_Fin(username,"ADMINISTRADOR","Funcion_1");

            System.out.println(m_f.toString());

            Mensaje_Correcto m_c = new Mensaje_Correcto(username,"ADMINISTRADOR","Funcion_1");

            System.out.println(m_c.toString());

         }
         catch(Exception e)
         {
              Mensaje_Error m_error = new Mensaje_Error(username,"ADMINISTRADOR","Funcion_1",e.toString());

            System.out.println(m_error.toString());  
         }
         
     
    }

    public void funcion2() {
        
        String mensaje_completo = "";

        String username = System.getProperty("user.name");
         
        Mensaje_Inicio m_i = new Mensaje_Inicio(username,"USUARIO","Funcion_2"); //Creamos el mensaje de inicio.

        System.out.println(m_i.toString());


         float calculo = 0;

         int aleatorio = (int) (Math.random() * 100);  //Aletorio del 1 al 100

         try
         {
            calculo = 10/aleatorio;  //Excepcion division por cero.
            
            if(aleatorio == 78) 
            {
                Mensaje m_nulo = null;

                m_nulo.toString(); //Excepcion accedemos a un objeto vacío.
            }
            
            
            Mensaje_Ejecucion m_e = new Mensaje_Ejecucion(username,"USUARIO","Funcion_2");

            System.out.println(m_e.toString());

            Mensaje_Fin m_f = new Mensaje_Fin(username,"USUARIO","Funcion_2");

            System.out.println(m_f.toString());

            Mensaje_Correcto m_c = new Mensaje_Correcto(username,"USUARIO","Funcion_2");

            System.out.println(m_c.toString());

         }
         catch(Exception e)
         {
              Mensaje_Error m_error = new Mensaje_Error(username,"USUARIO","Funcion_2",e.toString());

            System.out.println(m_error.toString());  
         }
    
    }
    
    public void funcion3() {

        String mensaje_completo = "";

        String username = System.getProperty("user.name");
         
        Mensaje_Inicio m_i = new Mensaje_Inicio(username,"USUARIO_PRIVILEGIOS","Funcion_3"); //Creamos el mensaje de inicio.

        System.out.println(m_i.toString());


         float calculo = 0;

         int aleatorio = (int) (Math.random() * 100);  //Aletorio del 1 al 100

         try
         {
            calculo = 10/aleatorio;  //Excepcion division por cero.
            
            if(aleatorio == 78) 
            {
                Mensaje m_nulo = null;

                m_nulo.toString(); //Excepcion accedemos a un objeto vacío.
            }
            
            
            Mensaje_Ejecucion m_e = new Mensaje_Ejecucion(username,"USUARIO_PRIVILEGIOS","Funcion_3");

            System.out.println(m_e.toString());

            Mensaje_Fin m_f = new Mensaje_Fin(username,"USUARIO_PRIVILEGIOS","Funcion_3");

            System.out.println(m_f.toString());

            Mensaje_Correcto m_c = new Mensaje_Correcto(username,"USUARIO_PRIVILEGIOS","Funcion_3");

            System.out.println(m_c.toString());

         }
         catch(Exception e)
         {
              Mensaje_Error m_error = new Mensaje_Error(username,"USUARIO_PRIVILEGIOS","Funcion_3",e.toString());

            System.out.println(m_error.toString());  
         }
        
    }
    public void funcion4() {

        String mensaje_completo = "";

        String username = System.getProperty("user.name");
         
        Mensaje_Inicio m_i = new Mensaje_Inicio(username,"JEFE_PROYECTO","Funcion_4"); //Creamos el mensaje de inicio.

        System.out.println(m_i.toString());


         float calculo = 0;

         int aleatorio = (int) (Math.random() * 100);  //Aletorio del 1 al 100

         try
         {
            calculo = 10/aleatorio;  //Excepcion division por cero.
            
            if(aleatorio == 78) 
            {
                Mensaje m_nulo = null;

                m_nulo.toString(); //Excepcion accedemos a un objeto vacío.
            }
            
            
            Mensaje_Ejecucion m_e = new Mensaje_Ejecucion(username,"JEFE_PROYECTO","Funcion_4");

            System.out.println(m_e.toString());

            Mensaje_Fin m_f = new Mensaje_Fin(username,"JEFE_PROYECTO","Funcion_4");

            System.out.println(m_f.toString());

            Mensaje_Correcto m_c = new Mensaje_Correcto(username,"JEFE_PROYECTO","Funcion_4");

            System.out.println(m_c.toString());

         }
         catch(Exception e)
         {
              Mensaje_Error m_error = new Mensaje_Error(username,"JEFE_PROYECTO","Funcion_4",e.toString());

            System.out.println(m_error.toString());  
         }

        }

}
