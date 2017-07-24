/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabean;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Ravi Kandel
 */
public class Javabean implements Serializable{

    public Javabean() {
        System.out.println("Java Bean Activated");
    }
   public void add(JTextField j1, JTextField j2, JTextField j3){
       Double t1 = Double.parseDouble(j1.getText());
       Double t2 = Double.parseDouble(j2.getText());
       Double t3= t1 + t2;
       j3.setText(t3.toString());
   }
   public void multiply(JTextField j1, JTextField j2, JTextField j3){
       Double t1 = Double.parseDouble(j1.getText());
       Double t2 = Double.parseDouble(j2.getText());
       Double t3= t1 * t2;
       j3.setText(t3.toString());
   }
   
   public void difference(JTextField j1, JTextField j2, JTextField j3){
       Double t1 = Double.parseDouble(j1.getText());
       Double t2 = Double.parseDouble(j2.getText());
       Double t3= t1 - t2;
       j3.setText(t3.toString());
   }
    
    
}
