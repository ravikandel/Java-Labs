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
        Glome g=new Glome("Glome",4);
        System.out.println("Volume of "+g.getName()+" is "+g.getVolume());
        Cube c=new Cube("Cube",3);
        System.out.println("Volume of "+c.getName()+" is "+c.getVolume());
        Sphere s= new Sphere("Sphere",5);
        System.out.println("Volume of "+s.getName()+" is "+s.getVolume());
        Cylinder cl=new Cylinder(3,"Cylinder",2);
        System.out.println("Volume of "+cl.getName()+" is "+cl.getVolume());
        Square sq=new Square("Square",4);
        System.out.println("Area of "+sq.getName()+" is "+sq.getArea());
        Circle cr=new Circle("Circle",3);
        System.out.println("Area of "+cr.getName()+" is "+cr.getArea());
        
        
        
    }
}
