import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Database {
    Connection conn;
    ResultSet rs;
    String USER = "root";
    String PASS = "";
    String URL = "jdbc:mysql://localhost:3306/jbk";
    
    public Connection Connect(){
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection(URL,USER,PASS);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet loginData(){
        try {
            Connection c = this.Connect();
            String sql = "select * from login";
            PreparedStatement st = c.prepareStatement(sql);
            rs = st.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        // Insert into DB
       
}
        
        
  
        
        
    }



       
    
    
