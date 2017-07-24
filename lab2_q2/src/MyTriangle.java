/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class MyTriangle extends MyPoint{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    MyTriangle(){
        this.v1=new MyPoint(0,0);
        this.v2=new MyPoint(0,0);
        this.v3=new MyPoint(0,0);
    }
    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }
    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override
    public String toString()
    {
        return "Triangle @ "+v1.toString()+" , "+v2.toString()+" , "+v3.toString();   
    }
    public double getDistance(){
        double a= Math.sqrt(Math.pow(v2.getX()-v1.getX(), 2)+Math.pow(v2.getY()-v1.getY(), 2));
        double b= Math.sqrt(Math.pow(v3.getX()-v2.getX(), 2)+Math.pow(v3.getY()-v2.getY(), 2));
        double c= Math.sqrt(Math.pow(v1.getX()-v3.getX(), 2)+Math.pow(v1.getY()-v3.getY(), 2));
        return a+b+c;
    }
    
    public String getPerimeter(){
        return "Perimeter is: "+getDistance();
    }
    public String printType(){
        int output=equals(v1,v2,v3);
        String TriangleType="";
        if(output==1){
            TriangleType="Equilateral";
        }
        else if(output==2){
            TriangleType="Isoseles";
        }
        else if(output==3){
            TriangleType="Scalene";
        }
        
        return "This is "+TriangleType+" Triangle";
    }
    
    public int equals(MyPoint a, MyPoint b, MyPoint c){
        int out=0;
        if(a.getX()==b.getX()&&a.getY()==b.getY()){
            if(a.getX()==c.getX()&&a.getY()==c.getY()){
                out=1;
            }
            else{
                out=2;
            }
        }
        else{
            out=3;
        }
         return out;   
    }
}
    
