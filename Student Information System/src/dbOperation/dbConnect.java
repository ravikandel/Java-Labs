/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOperation;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ravi Kandel
 */
public class dbConnect {

    String HOST;
    String PORT;
    String DBNAME;
    String USERNAME;
    String PASSWORD;
    Connection conn = null;

    public dbConnect() {
        this.HOST = "localhost";
        this.PORT = "5432";
        this.DBNAME = "javadb";
        this.USERNAME = "postgres";
        this.PASSWORD = "postgres";

    }

    public Connection ConnectDB() {
        String ConnectionString = "jdbc:postgresql://" + this.HOST + ":" + this.PORT + "/" + this.DBNAME;
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(ConnectionString, this.USERNAME, this.PASSWORD);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Error: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.toString());
        }
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Connection Succesfull!");
        }
        return this.conn;
    }

}
