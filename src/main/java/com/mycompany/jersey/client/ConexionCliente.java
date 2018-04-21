/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.client;

/**
 *
 * @author wolfm
 */
import com.mycompany.jersey.aplicacion.Aplicacion;
import com.mycompany.modelo.Mensaje;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
public class ConexionCliente {
    

	Client client = Client.create();
	String getUrl = "http://localhost:8080/mavenproject1/rest/mensaje/data/get";
	String postUrl = "http://localhost:8080/mavenproject1/rest/mensaje/data/trabajar";
        
	public static void main(String[] args) {
		ConexionCliente cliente = new ConexionCliente();
		
        //Se lanza una petici�n GET b�sica
		//cliente.getRequest();
		//Se lanza una petici�n POST con par�metros
		//cliente.postRequest();
		
        //Se lanza una petici�n GET lista de Estudiantes
		//cliente.getRequest3();
	}
	
	
	/**
	 * M�todo para solicitar un servicio REST v�a GET
	 */
	public void getRequest(){
		//Se prepara la petici�n
		WebResource webResource = client.resource(getUrl);
		
		//Se indica que se esperan datos JSON y se hace la petici�n
		ClientResponse respuesta = webResource.accept("application/json").get(ClientResponse.class);
		if(respuesta.getStatus()!=200){  //Si el servidor nos responde con un c�digo HTTP distinto de 200, error
			throw new RuntimeException("Error de HTTP: "+ respuesta.getStatus());
		}
		
		//El servidor nos ha respondido con un 200: todo ok, sacamos la respuesta
		String resultado = respuesta.getEntity(String.class);
		System.out.println("===================================");
		System.out.println("Respuesta desde el servidor (pasada a string): ");
		System.out.println(resultado);
		System.out.println("");	
	}
	
	
	
	
	
	/**
	 * M�todo para enviar datos JSON a un servicio REST v�a POST
	 */
	public void postRequest(Mensaje m){
            
            
            try {
                /*
                Esta funcion seria el nuevo sendMessage()
                Esta funcion envia al servidor el mensaje (datos) como JSON y ya el servidor se encarga
                de insertarlos, el cliente se despreocupa completamente.
                
                El botón de la web debería accionar esta funcion de algun modo.
                Una posibilidad es que esta clase sea un servlet y que el boton
                ejecute el servlet que ejecuta las funciones que simulan el trabajo
                que a su vez llaman a esta funcion que envia el mensaje al servidor.
                
                */
                //Se perpara la petici�n
                WebResource webResource = client.resource(postUrl);
                
                //Se generan datos
                ObjectMapper mapper = new ObjectMapper();
                String jsonString = mapper.writeValueAsString(m);
                //Se env�an datos
                
                ClientResponse respuesta = webResource.accept("application/json").type("application/json").post(ClientResponse.class,jsonString);
                
                //Si la respuesta es un no aceptado (cualquier cosa distinta de 201)
                if(respuesta.getStatus()!=201){
                    throw new RuntimeException("Error en HTTP: "+ respuesta.getStatus());
                }
                
                //La respuesta fue 201 aceptado, se muestran los resultados
                String resultado = respuesta.getEntity(String.class);
                System.out.println("===================================");
                System.out.println("Respuesta desde el servidor: ");
                System.out.println(resultado);
                System.out.println("");
            } catch (IOException ex) {
                Logger.getLogger(ConexionCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
 
	
}