///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Ravi Kandel
// */
//public class MyPoint {
//    int x;
//    int y;
//    MyPoint(){
//        this.x=0;
//        this.y=0;
//    }
//    MyPoint(int x, int y){
//        this.x=x;
//        this.y=y;
//    }
//    public int getX(){
//        return this.x;
//    }
//    public void setX(int x){
//        this.x=x;
//    }
//    public int getY(){
//        return this.y;
//    }
//    public void setY(int y){
//        this.y=y;
//    }
//    public void setXY(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//    
//    public double distance(int x2,int y2){
//        return Math.sqrt(Math.pow(x2-this.x,2)+Math.pow(y2-this.y,2));
//    }
//    public double distance(MyPoint another){
//        return Math.sqrt(Math.pow(another.x-this.x,2)+Math.pow(another.y-this.y,2));
//    }
//    
//    public static void main(String[] args) {
//        MyPoint mp= new  MyPoint();
//        System.out.println(mp.distance(2, 2));
//    }
//}
