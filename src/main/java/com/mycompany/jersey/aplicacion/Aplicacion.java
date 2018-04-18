/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.aplicacion;

import com.mycompany.modelo.Mensaje;
import com.mycompany.modelo.Mensaje_Correcto;
import com.mycompany.modelo.Mensaje_Ejecucion;
import com.mycompany.modelo.Mensaje_Error;
import com.mycompany.modelo.Mensaje_Inicio;
import com.mycompany.modelo.Mensaje_Fin;
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
        for (int i=0; i<10000; i++){
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

    public static void funcion2() {
        
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
    
    public static void funcion3() {

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
    public static void funcion4() {

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
