/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Shape {
    String color;
    boolean filled;
    
    Shape(){
        this.color="red";
        this.filled=true;
    }
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean Filled){
        this.filled=Filled;
    }
    @Override
    public String toString(){
        String filledornot;
        if(filled){
            filledornot="Filled";
        }
        else{
            filledornot="not Filled";
        }
        return "A shape with Color of "+this.color+" and "+filledornot;
    } 
 
}
