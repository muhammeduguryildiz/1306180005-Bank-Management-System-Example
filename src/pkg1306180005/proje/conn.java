/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306180005.proje;

/**
 *
 * @author Ugur
 */
import java.sql.*;  

public class conn{

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("org.sqlite.JDBC");  
            c =DriverManager.getConnection("jdbc:sqlite:./Bank.db");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
