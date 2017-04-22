/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author Justin
 */
public class DatabaseConn {
    final String DB_URL = "jdbc:mysql://sql.computerstudi.es:3306/gc200328630";
    
    private final String USERNAME = "gc200328630";
    private final String PASSWORD = "hYLhvjna";
    private Connection conn;
    
    //method to create and return a connection
    public Connection getConnectyion(){
        try{
            conn = DriverManager.getConnection(
            DB_URL,
            USERNAME,
            PASSWORD);
        }
        catch(SQLException error){
            error.toString();
        }return conn;
    }
            
}

