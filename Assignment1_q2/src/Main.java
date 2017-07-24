/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Main {
    
    public static void main(String []args){
        WeighedItem w =new WeighedItem("Banana",3.00,1.37);
        System.out.println(w.toString());
        CountedItem c =new CountedItem("Pens",4.5,10);
        System.out.println(c.toString());
        
    }
}
