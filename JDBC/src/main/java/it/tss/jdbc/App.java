/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss  
 */
public class App {
    public static void main(String[] args) throws SQLException {
        Connection cn = DriverManager
                .getConnection("jdbc:mariadb://localhost:3306/classicmodels","tss","ghiglieno");
        System.out.println("connection to db ok....");
        
        Statement cmd = cn.createStatement();
        
        ResultSet rs = cmd.executeQuery("select customerName, city, state from customers where state like 'NY'");
    
        while(rs.next()){
            System.out.println(String.format("nome: %s , citta: %s, stato: %s", 
                    rs.getString("customerName"), rs.getString("city"), rs.getString("state")));
        }
        
        rs.close();
        cmd.close();
        cn.close();
    }
}
