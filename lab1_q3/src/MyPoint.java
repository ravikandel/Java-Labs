/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class MyPoint {
    int x;
    int y;
    
    MyPoint(){
        this.x=0;
        this.y=0;
    }
    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "X: "+x+"\nY: "+y;
    }  
    public double distance(int x, int y){
        double result;
        result=Math.sqrt((y-0)*(y-0)+(x-0)*(x-0));
        return result;
    }
    public double distance(MyPoint another){
        this.x=another.x;
        this.y=another.y;
        double result;
        result=Math.sqrt((y-0)*(y-0)+(x-0)*(x-0));
        return result;
    }
   
    
    
}
