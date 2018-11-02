/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.events.managment.dbservices;

import acme.events.management.model.Speaker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Administrator
 */
public class PersistenceManager {

    private final static List<Speaker> speakers = new ArrayList<>();
    private static Connection conn;

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //must live in a configuration file
        String connectionUrl = "jdbc:sqlserver://STUDENT04\\SQLEXPRESS:1433;databaseName=Events;integratedSecurity=true;";
        conn = DriverManager.getConnection(connectionUrl);
    }

    public static void saveToDb(Speaker speaker) throws SQLException, ClassNotFoundException {
        connect();
        PreparedStatement ps = conn.prepareStatement("insert into speaker(name,rate,contactNumber)values(?,?,?)");
        ps.setString(1, speaker.getName());
        ps.setDouble(2, speaker.getRate());
        ps.setString(3, speaker.getContactNumber());

        ps.execute();
    }

    public static List<Speaker> findSpeakerWithHighestRate() {
        return null;
    }

    public static List<Speaker> findSpeakerWithLongestName() {
        return null;
    }

    public static List<Speaker> findSpeakerWithShortestName() {
        return null;
    }

    public static List<Speaker> getSpeakers() {
        try {
            connect();
            ResultSet rs = conn.prepareStatement("select id, name, rate, contactnumber from speaker").executeQuery();

            while (rs.next()) {
                speakers.add(new Speaker(rs.getString("name"), UIManager.getString("contactnumber"), rs.getDouble("rate")));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PersistenceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return speakers;
    }
//    public static List<Speaker> getSpeakers(List<Speaker> speakers){
//    return speakers;
//    }
}
