/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Circle extends Shape implements Area {
    double radius;
    Circle(){
        super("");
        this.radius=0;
    }
    Circle(String name, double radius){
        super(name);
        this.radius=radius;
    }
    @Override
    public double getArea(){
     return Math.PI*Math.pow(this.radius, 2);
    }
}
