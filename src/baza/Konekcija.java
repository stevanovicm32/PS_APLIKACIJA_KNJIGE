/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Konekcija {
    private static Konekcija instance;
    private Connection connection;
    private Konekcija(){
        try {
            String url="jdbc:mysql://localhost:3307/ps_vanja";
            connection=DriverManager.getConnection(url, "root","Masacar1.");
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("Greska1");
        }
    }
    public static Konekcija getInstance(){
        if(instance==null)
        {
            instance=new Konekcija();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
