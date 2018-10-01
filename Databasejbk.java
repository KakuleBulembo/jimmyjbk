/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chris
 */
public class Databasejbk {
    private Connection con;
    private String url;
    private String Username;
    private String Password;
    
    public Databasejbk(){
        url = "jdbc:mysql://localhost:3306/jbkempire";
        Username ="root";
        Password ="";
        
    }
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc");
        } catch (Exception e){
            System.out.printf(e.getMessage());
        }
        try{
            con=DriverManager.getConnection(url, Username, Password);
        } catch (Exception e){
        }
        return con;
    }
    
}
