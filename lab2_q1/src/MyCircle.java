/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class MyCircle extends MyPoint{
    private MyPoint center;
    private int radius;
    
    MyCircle(){
        super(0,0);
        this.radius =1;
    }
    MyCircle(int x, int y, int radius){
        super(x,y);
        this.radius =radius;
    }
    MyCircle(MyPoint center, int radius){
        this.center=new MyPoint(0,0);
        this.radius =radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;//mypoint type;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return this.getX();
    }
    public int getCenterY(){
        return this.getY();
    }
    public void setCenterXY(int x, int y){
        this.setXY(x, y);
    }
    @Override
    public String toString(){
       return "Circle @ ("+getCenterX()+","+getCenterY() +")radius= "+radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
