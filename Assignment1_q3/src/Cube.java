/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Cube extends Square implements Volume {
    
    Cube(){
        super("",0);
    }
    Cube(String name,double side){
        super(name,side);
    }
    @Override
    public double getVolume(){
        return Math.pow(this.side, 3);
    }
    
}
