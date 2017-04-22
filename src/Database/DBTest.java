/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Justin
 */
public class DBTest {
      public static void main(String[] args) throws SQLException
    {
        final String DB_URL = "jdbc:mysql://sql.computerstudi.es:3306/gc200328630";
        final String QRY = "SELECT * FROM GasPrices";
       
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
       
        try{
            conn = DriverManager.getConnection(DB_URL, "gc200328630","hYLhvjna");
            stat = conn.createStatement();
            rs = stat.executeQuery(QRY);
           
           
            ResultSetMetaData metaData = rs.getMetaData();
            int numOfCols = metaData.getColumnCount();
           
            System.out.println("Results: ");
           
            //to iterate all the rows from the database
            while(rs.next()){
                //to iterate each column from every row
                for(int i = 1; i <= numOfCols; i++){
                    System.out.printf("%-8s\t",
                            metaData.getColumnName(i) +
                                    ": " + rs.getObject(i) );
                    System.out.println("");
                }
            }
           
        }catch(SQLException error){
            error.printStackTrace();
        }catch(Exception error){
            error.printStackTrace();
        }finally{
            //close connection to db
            rs.close();
            stat.close();
            conn.close();
        }
        insertData();
    }
   
 
        public static void insertData() throws SQLException{
            Statement stat = null;
            Connection conn = null;
            
            String name = null;
            double cost = 0.00;

            final String DB_URL = "jdbc:mysql://sql.computerstudi.es:3306/gc200328630";
           
            try{
                conn = DriverManager.getConnection(DB_URL, "gc200328630","hYLhvjna");
               
                stat = conn.createStatement();
               
                String QRY =" insert into GasPrices" + "(name, cost)" + " values (" + name + "', '" + cost + ")";
                stat.executeUpdate(QRY);
                System.out.println("Data Inserted");
               
            }catch (SQLException error){
                error.printStackTrace();
           
            }finally{
                stat.close();
                conn.close();
            }
        }
}

