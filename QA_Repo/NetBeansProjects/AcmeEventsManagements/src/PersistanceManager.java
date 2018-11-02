/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import acme.events.managements.model.Speaker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class PersistanceManager {
    private static Connection conn;
    
    private static void void connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://INSTRUCTOR\\SQLEXPRESS:1433;databaseName=events;integratedSecurity=true;";
        conn = DriverManager.getConnection(connectionUrl);
    }
    
    public static void save(Speaker speaker) throws SQLExeption, ClassNotFoundException {
    connect();
    PreparedStatement ps = conn.prepareStatement("insert into speaker(name, rate, contact)");
    }
}
