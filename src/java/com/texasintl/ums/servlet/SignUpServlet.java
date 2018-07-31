/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.ums.servlet;

import com.texasintl.ums.db.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Niraj Karanjeet
 */
public class SignUpServlet extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        String fn = request.getParameter("Full_Name");
        String gn = request.getParameter("Gender");
        String dob = request.getParameter("Dateofbirth");
        String pn = request.getParameter("PhoneNumber");
        String ad = request.getParameter("Address");
        String un = request.getParameter("Username");
        String ps = request.getParameter("Password");
        String em = request.getParameter("Email");
        
       PrintWriter hi = response.getWriter(); 
            hi.println(un+" have just signed in.");
            saves(fn,gn,dob,pn,ad,un,ps,em);
     
    }
    
    public void saves(String a,String b,String c,String d,String e,String f,String g,String h){
        try{
            Connection myCon = DatabaseConnection.getConnection();
            Statement stat = myCon.createStatement();
            String sql= "insert into signup_table"
                    +"(Full_Name,Gender,Dateofbirth,PhoneNumber,Address,Username,Password,Email)"
                   +"values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
            stat.executeUpdate(sql);
            System.out.println("SignUp complete.");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
}
}