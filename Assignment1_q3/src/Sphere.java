/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Sphere extends Circle implements Volume{
    Sphere(){
        super("",0);
    }
    Sphere(String name, double radius){
        super(name,radius);
    }
    @Override
    public double getVolume(){
        return ((4.0)/3)*Math.PI*Math.pow(this.radius, 3);
    }
}
