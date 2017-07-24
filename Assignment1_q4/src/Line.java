/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Line {
    Point begin;
    Point end;
    Line (){
        this.begin = new Point(0,0);
        this.end = new Point(0,0);
    }
    Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }
    Line(Point begin, Point end){
        this.begin=begin;
        this.end=end;
    }
    public Point getBegin(){
        return this.begin;
    }
    public void setBegin(Point begin){
        this.begin=begin;
    }
    public Point getEnd(){
        return this.end;
    }
    public void setEnd(Point end){
        this.end=end;
    }
    public int getBeginX(){
        return this.begin.x;
    }
    public void setBeginX(int x){
        //this.begin.x=x;
        this.begin.setX(x);
    }
    public int getBeginY(){
        return this.begin.x;
    }
    public void setBeginY(int y){
        this.begin.y=y;
    }
    public void setBeginXY(int x, int y){
        this.begin.x=x;
        this.begin.y=y;
    }
    public int getEndX(){
        return this.end.x;
    }
    public void setEndX(int x){
        this.end.x=x;
    }
    public int getEndY(){
        return this.end.x;
    }
    public void setEndY(int y){
        this.end.y=y;
    }
    public void setEndXY(int x, int y){
        this.end.x=x;
        this.end.y=y;
    }
    @Override
    public String toString(){
        return "The Begin Point is : " + begin.toString() + " and End Point is: " + end.toString();
    }
    public double getLength(){
        return Math.sqrt(Math.pow(end.x-begin.x,2)+Math.pow(end.y-begin.y,2));
    }
            
}
