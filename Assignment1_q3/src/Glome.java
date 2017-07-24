/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Glome extends Sphere implements Volume {
    Glome(){
        super("",0);
    }
    Glome( String name,double radius){
        super(name,radius);
    }
    @Override
    public double getVolume(){
        return (0.5)*Math.PI*Math.PI*Math.pow(this.radius, 4);
    }
    
}
