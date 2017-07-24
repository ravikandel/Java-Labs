/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Circle extends Shape{
    
    double radius;
    Circle()
    {
        this.radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color,filled);//assigned the value to parent class
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return(Math.PI*radius*radius);
    }
    public double getPerimeter(){
        return(2*Math.PI*radius);
    }
    @Override
    public String toString(){
        return "This is a circle with radius: "+this.radius+" which is a subclass of "+super.toString();
    } 
}
