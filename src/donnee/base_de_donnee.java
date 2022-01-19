/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guerin
 */
public class base_de_donnee {
    Connection conn;
    
    public base_de_donnee(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
        Logger.getLogger(base_de_donnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projethotel", "root", "");
        }catch (SQLException ex){
            Logger.getLogger(base_de_donnee.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    public Connection getconnexion(){return conn;}
}
