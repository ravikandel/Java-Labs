
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Main {
    public static void main(String []args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the values as \nX1: ");
        int x1=input.nextInt();
        System.out.println("Y1: ");
        int y1=input.nextInt();
        System.out.println("X2: ");
        int x2=input.nextInt();
        System.out.println("Y2: ");
        int y2=input.nextInt();
        
        
        System.out.println("--Using Line Class Only:");
        Line L1 = new Line(x1,y1,x2,y2);
        System.out.println(L1.toString());
        System.out.println("The Length is");
        System.out.println(L1.getLength());
        
        System.out.println("--Using Point and Line Class:");
        Point begin = new Point(x1,y1);
        Point end = new Point(x2,y2);
        Line L2 = new Line(begin,end);
        System.out.println(L2.toString());
        System.out.println("The Length is");
        System.out.println(L2.getLength());
        
        System.out.println("--Using setBeginXY and setEndXY in Line Class:");
        Line L3 = new Line();
        L3.setBeginXY(x1,y1);
        L3.setEndXY(x2,y2);
        System.out.println(L3.toString());
        System.out.println("The Length is");
        System.out.println(L3.getLength());
        
        System.out.println("--Using setX, setY and getX, getY in Point Class:");
        Point P1 = new Point();
        P1.setX(x1);
        P1.setY(y1);
        System.out.println("(X,Y)= ("+P1.getX()+","+P1.getY()+")");

    }
}
