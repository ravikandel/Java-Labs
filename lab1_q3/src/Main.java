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
    public static void main(String [] args){
        
        System.out.println("New Value is: \n");
        MyPoint mp=new MyPoint();  
        System.out.println(mp.toString());
        
        System.out.println("New Value is: \n");
        mp.setXY(1,1);
        System.out.println("x: "+mp.x);
        System.out.println("Y: "+mp.y);
        
        System.out.println("New Value is: \n");
        mp.setX(5);
        mp.setY(5);
        System.out.println(mp.toString());
        
        System.out.println("New Value is: \n");
        MyPoint mpp=new MyPoint(2,2);  
        System.out.println(mpp.toString());
        
        System.out.println("New Value is: \n");
        System.out.println(mpp.getX());
        System.out.println(mpp.getY());
        
        System.out.println("Distance is: ");
        System.out.println(mp.distance(1, 2));
        
        System.out.println("Distance is: ");
        MyPoint a=new MyPoint(1,2);
        System.out.println(mp.distance(a));
        
    }
}
