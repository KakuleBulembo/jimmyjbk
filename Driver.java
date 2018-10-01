/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author chris
 */
public class Driver {
    private Connection con;
    private ;
    private static final String CONN_STRING=
            "jdbc:mysql://localhost/jbkempire";
    
    public static void main(String[] args) {
        connection conn=null;
        try {
        conn = (connection) DriverManager.getConnection(CONN_STRING, Username, Password);
        System.out.print("Connected");
        Statement stmt=(Statement) conn.createStatement();
        String Username="Jimmy";
        } catch(Exception ex){
            
    }

  
   
    
    
    }
