/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        try (
            Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/songs", "tss", "ghiglieno");  Statement q = cn.createStatement();  ResultSet result = q.executeQuery("select title,artist from song order by artist");) {
            stampaRisultato(result);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void stampaRisultato(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        int ncol = meta.getColumnCount();
        while (result.next()) {
            for (int i = 1; i <= ncol; i++) {
                if (meta.getColumnClassName(i).equals("java.lang.String")) {
                    System.out.print(result.getString(i));
                }
                if (i < ncol) {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }

    }
}
