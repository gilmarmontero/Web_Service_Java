/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Montero
 */
public class ConnectionFactory {
    
    private final static String DRIVER = "com.mysql.jdbc.Driver",
            URL = "jdbc:mysql://127.0.0.1:3306/revistaintegra",
            USER = "root",
            PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado com Sucesso");
            return con;
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex){
            System.out.println("Impossivel conectar");
            System.out.println(ex.getMessage());
        }
        return null;
    }
            
            
    
}
