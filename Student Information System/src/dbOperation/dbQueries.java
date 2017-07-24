/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOperation;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ravi Kandel
 */
public class dbQueries {

    public dbQueries() {

    }

    public void addStudentInformation(ArrayList data) {
        dbConnect connectdb = new dbConnect();
        Connection c = connectdb.ConnectDB();
        PreparedStatement pstmt = null;

        /*      Statement stmt = null;
        String sql = "Insert into tbl_student "
                + "(first_name,last_name,address,gender,phone,email) values "
                + "('Ravi','Kandel','Balaju','Male','9849322788','email@email.com')";
         */
        try {
            String query = "Insert into tbl_student "
                    + "(first_name,last_name,address,gender,phone,email,dob)"
                    + "values(?,?,?,?,?,?,?) ";
            pstmt = c.prepareStatement(query);
            pstmt.setString(1, data.get(0).toString());
            pstmt.setString(2, data.get(1).toString());
            pstmt.setString(3, data.get(2).toString());
            pstmt.setString(4, data.get(3).toString());
            pstmt.setString(5, data.get(4).toString());
            pstmt.setString(6, data.get(5).toString());

            SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date myDate =format.parse(data.get(6).toString());
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            
            pstmt.setDate(7, sqlDate);

            pstmt.executeUpdate();
            //stmt = c.createStatement();
            //stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went Wrong!: " + ex.toString());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        JOptionPane.showMessageDialog(null, "Record Added Succesfully!");
        
    }
    
    public ResultSet viewStudentInformation() {
        dbConnect connectdb = new dbConnect();
        Connection c = connectdb.ConnectDB();
        ResultSet rs = null;
        Statement stmt = null;

        try {
            String query = "Select * from tbl_student order by id ASC";
            stmt = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Statement Error: " + ex.toString());
        }
        return rs;
    }
    
    
    public void updateStudentInformation(ArrayList data) {
        dbConnect connectdb = new dbConnect();
        Connection c = connectdb.ConnectDB();
        PreparedStatement pstmt = null;
        try {
            String query = "Update tbl_student SET first_name=?,last_name=?,address=?,gender=?,phone=?,email=?,dob=? where id="+data.get(7).toString();
            pstmt = c.prepareStatement(query);
            pstmt.setString(1, data.get(0).toString());
            pstmt.setString(2, data.get(1).toString());
            pstmt.setString(3, data.get(2).toString());
            pstmt.setString(4, data.get(3).toString());
            pstmt.setString(5, data.get(4).toString());
            pstmt.setString(6, data.get(5).toString());

            
            SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date myDate =format.parse(data.get(6).toString());
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            
            pstmt.setDate(7, sqlDate);
                    
            //pstmt.setString(8, data.get(7).toString());
            
            //System.out.println(data.get(7).toString());

            pstmt.executeUpdate();
            //stmt = c.createStatement();
            //stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went Wrong!: " + ex.toString());
       } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        JOptionPane.showMessageDialog(null, "Record Updated Succesfully!");
        
    }
    
}
