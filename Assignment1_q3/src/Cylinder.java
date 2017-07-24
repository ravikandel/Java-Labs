/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Cylinder extends Circle implements Volume {
    double height;
    
    Cylinder(){
        super("",0);
        this.height=0;
    }
    Cylinder(double height, String name,double radius){
        super(name,radius);
        this.height=height;
    }
    @Override
    public double getVolume(){
        return Math.PI*Math.pow(this.radius, 2)*this.height;
    }
}
