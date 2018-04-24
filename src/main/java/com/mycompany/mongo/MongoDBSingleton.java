/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.modelo.Mensaje;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

public class MongoDBSingleton {

 private static MongoDBSingleton mDbSingleton;
 
 private static MongoClient mongoClient;
    
 private static MongoDatabase db ;
 
 
 private static final String dbHost = "localhost";
 private static final int dbPort = 27017;
 private static final String dbName = "mensajesDB";
 private static final String dbUser = "pecl3";
 private static final char[] dbPassword = {'p', 'e', 'c', 'l', '3'};     


 
 
 public static MongoDBSingleton getInstance(){
  if(mDbSingleton == null){
    mDbSingleton = new MongoDBSingleton();
    
  }
  return mDbSingleton;
 }
 
 public MongoDatabase getTestdb(){
     

  //MongoCredential credential = MongoCredential.createCredential(dbUser, dbName, dbPassword);
             
     
  if(mongoClient == null){
      //mongoClient = new MongoClient(dbHost , dbPort);
      
      //ESTAS 2 LINEAS ES PARA LA CONEXION HIPOTETICA CON LOS MONGO DE DOCKER.
      //MongoClientURI uri  = new MongoClientURI("mongodb://"+dbHost); 
      //mongoclient = new MongoClient(uri);
      
      mongoClient = new MongoClient(new ServerAddress(dbHost, dbPort));

                                        //Arrays.asList(credential) //opcional si tenemos user y pass
   

  }
  if(db == null) {
      db = mongoClient.getDatabase(dbName);
  }
   
  
  return db;
 }
 
 public void InsertMessage(Document doc){
     MongoCollection<Document> collection = db.getCollection("mensajes");
   
    
     
     //String jsonString = mapper.writeValueAsString(m);
     //System.out.println("Json: " + jsonString);
     //doc = Document.parse(jsonString);
     collection.insertOne(doc);
     
     



 }
}

