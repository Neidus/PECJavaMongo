/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.serve;

/**
 *
 * @author wolfm
 */import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mycompany.modelo.*;
import com.mycompany.mongo.MongoDBSingleton;
import com.sun.jersey.server.impl.container.servlet.Include;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/mensaje/data")
public class conexion_serve {   

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
        
    

	
	
	@POST
	@Path("/trabajar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postMensaje(Mensaje alguien){
            
             /*
                    Aqui el servidor recibira un mensaje desde el cliente.
                    
            El servidor insertara en mongo el mensaje tras volverlo a convertir en json.
                
             */
             MongoDBSingleton mongo = MongoDBSingleton.getInstance();
             mongo.getTestdb();
             
            
            ObjectMapper mapper = new ObjectMapper();
            String jsonString="";
            Document doc=null;
            try {
                jsonString = mapper.writeValueAsString(alguien);
                
                doc = Document.parse(jsonString);
                mongo.InsertMessage(doc);

            } catch (IOException ex) {
                Logger.getLogger(conexion_serve.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            return Response.status(201).entity(jsonString).build();
                
               

	}

}

