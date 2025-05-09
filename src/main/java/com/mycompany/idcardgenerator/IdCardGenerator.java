

package com.mycompany.idcardgenerator;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class IdCardGenerator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        IdCardGenerator _generator = new IdCardGenerator();
        _generator.CreateSqlConnection();
    }
    
    void CreateSqlConnection () 
    {
        try {
           Connection _connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "prashant123?");
 //          Statement _statement = _connection.createStatement();
//           ResultSet _result =_statement.executeQuery("SELECT * FROM students");
//            while (_result.next()) {                
//                String name = _result.getString("blood_group");
//                System.out.println(name);
//            }
//            // System.out.println("Connection established successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(IdCardGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


