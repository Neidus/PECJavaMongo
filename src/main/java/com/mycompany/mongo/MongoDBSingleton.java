/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.modelo.Mensaje;
import java.io.IOException;
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
 private static final String dbUser = "dbUser here";
 private static final String dbPassword = "dbPassword here";

 private MongoDBSingleton(){};
 
 public static MongoDBSingleton getInstance(){
  if(mDbSingleton == null){
    mDbSingleton = new MongoDBSingleton();
  }
  return mDbSingleton;
 } 
 
 public MongoDatabase getTestdb(){
  if(mongoClient == null){
      mongoClient = new MongoClient(dbHost , dbPort);
  }
  if(db == null) {
      db = mongoClient.getDatabase(dbName);
  }
   
  
  return db;
 }
 
 public void SendMessage(Mensaje m){
     MongoCollection<Document> collection = db.getCollection("mensajes");
   
     ObjectMapper mapper = new ObjectMapper();
     
     try {
         String jsonString = mapper.writeValueAsString(m);
         System.out.println("Json: " + jsonString);
         Document doc = Document.parse(jsonString);
         collection.insertOne(doc);
     } catch (IOException ex) {
         Logger.getLogger(MongoDBSingleton.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     



 }
}

