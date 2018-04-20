/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.serve;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mycompany.modelo.*;

@Path("/mensaje/data")
public class Serve {   
    /*
	protected Estudiante creaEstudiante(){
		Estudiante manolito = new Estudiante();
		
		//Rellenamos de datos:
		manolito.setNombre("Manuel");
		manolito.setApellido("G�mez");
		manolito.setTitulacion("Master en Ingenier�a del Software para la Web");
		manolito.setNumMatricula(1235461);
		
		List<Libro> l = manolito.getLibros();
		Libro libro1 = new Libro();
		libro1.setAutor("Tannembaun");
		libro1.setTitulo("Todo lo que quiso saber de las redes");
		libro1.setAnyo(1992);
		Libro libro2 = new Libro();
		libro2.setAutor("Michels");
		libro2.setTitulo("Programaci�n y otros pasatiempos");
		libro2.setAnyo(1995);
		l.add(libro1);
		l.add(libro2);
		return manolito;
	}
	*/
   protected Mensaje CrearMensaje(){
      Mensaje mensaje01=new Mensaje(null,null,null);
      mensaje01.setUsuario("usuario01");
      mensaje01.setTipo_usuario("Becario");
      mensaje01.setId_funcion("111111111");
      mensaje01.setNombre_funcion("Funcion");
      mensaje01.setAutor_funcion("DON SERGIO");
      //mensaje01.setHora();
      mensaje01.setTipo_retorno("Get");
      
      
      return mensaje01;
   }
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Mensaje getEstudiante(){
		//Creamos un estudiante
		Mensaje mens = CrearMensaje();
		
		return mens;
	}

	@GET
	@Path("/get3")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mensaje> getEstudiantes3(){
		//Creamos una lista de estudiantes
		List<Mensaje> lista = new ArrayList<Mensaje>();
		lista.add(CrearMensaje());
		lista.add(CrearMensaje());
		lista.add(CrearMensaje());

		return lista;
	}	
	
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postMensaje(Mensaje alguien){
		String resultado = "El registro enviado es: "+ alguien;
		return Response.status(201).entity(resultado).build();
	}

}

