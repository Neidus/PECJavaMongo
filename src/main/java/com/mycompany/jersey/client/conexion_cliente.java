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
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
public class conexion_cliente {
    

	Client client = Client.create();
	String getUrl = "http://localhost:8080/JAX-RS-JSON/rest/mensaje/data/get";
	String getUrl3 = "http://localhost:8080/JAX-RS-JSON/rest/mensaje/data/get3";
	String postUrl = "http://localhost:8080/JAX-RS-JSON/rest/mensaje/data/post";
	public static void main(String[] args) {
		conexion_cliente cliente = new conexion_cliente();
		
        //Se lanza una petici�n GET b�sica
		cliente.getRequest();
                
		//Se lanza una petici�n POST con par�metros
		cliente.postRequest();
		
        //Se lanza una petici�n GET lista de Estudiantes
		cliente.getRequest3();
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
	 * M�todo para solicitar un servicio REST v�a GET
	 */
	public void getRequest3(){
		//Se prepara la petici�n
		WebResource webResource = client.resource(getUrl3);
		
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
	public void postRequest(){
		//Se perpara la petici�n
		WebResource webResource = client.resource(postUrl);
		
		//Se generan datos
//		String datos = "{\"nombre\":\"Antonio\",\"apellido\":\"Moratilla\"}";
		//String datos = "{\"nombre\":\"Antonio\",\"apellido\":\"Moratilla\",\"titulacion\":\"--PROFESOR--\",\"numMatricula\":\"202301\",\"libros\":[{\"titulo\":\"El Se�or de los Anillos\", \"autor\":\"J.R.R. Tolkien\", \"anyo\":1948}]}";
		String datos= "{\"Usuario\":\"Sergio\",\"Tipo_Usuario\":\"Admin\",\"Id_funcion\":\"111111\",\"Nombre_Funcion\":\"Funcion\",\"Autor_funcion\":\"Sergio\",\"Tipo_Retorno\":SET}]}";
		//Se env�an datos
		ClientResponse respuesta = webResource.type("application/json").post(ClientResponse.class,datos);
		
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
	}
	
}