/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey.aplicacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Varela
 */
public class SimularTrabajo extends HttpServlet {

    
    public void service(HttpServletRequest req,
    HttpServletResponse res) throws ServletException, IOException
    {
        Aplicacion app = new Aplicacion();
        System.out.println("Entramos en el servlet que simula trabajo");
        app.simularTrabajo();
        res.sendRedirect(res.encodeRedirectURL("/mavenproject1/index.html"));
    }
    
    



}
