package vehicle_reservation_system;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ivanl
 */
public class Database {
    Connection conn=null;
    public static Connection ConnecrDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\joey_\\Desktop\\Vehicles-Reservation-System\\Vehicles-Reservation-System\\Vehicles Reservation System\\src\\vehicle_reservation_system\\database.sqlite");
            JOptionPane.showMessageDialog(null, "Connected to the database!");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    
    }
}
