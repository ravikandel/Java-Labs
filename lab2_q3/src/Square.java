/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Square extends Rectangle {
    
    Square(){
        super(0,0);
    }
    Square(double side){
        super(side,side);
    }
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }
    @Override
    public void setWidth(double side){
        this.width=side;
    }
    @Override
    public void setLength(double side){
        this.length=side;
    }
    public String toString(){
        return "A Square with side= "+this.getSide()+" which is a subclass of "+super.toString();
    }
    
}
