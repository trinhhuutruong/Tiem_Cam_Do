/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnect {

    public static Connection makeConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String sql = "jdbc:sqlserver://localhost:1433;databaseName=Q_ANT";

<<<<<<< HEAD
            Connection con = DriverManager.getConnection(sql, "sa", "12345");
=======
            Connection con = DriverManager.getConnection(sql, "sa", "1234567890");
>>>>>>> 7229f114bcf8dbcc0fa7d8c4004e3cdc7f2b9a2e
            return con;
        } catch (SQLException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
            return null;
        }
    }
