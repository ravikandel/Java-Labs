/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class TestMyTriangle {

    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle();
        MyTriangle t2 = new MyTriangle(2, 2, 2, 2, 4, 4);
        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint();
        MyPoint p3 = new MyPoint();
        p3.setXY(4, 5);
        MyTriangle t3 = new MyTriangle(p1, p2, p3);
        System.out.println(t1.toString());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.printType());
        System.out.println(t2.toString());
        System.out.println(t2.getPerimeter());
        System.out.println(t2.printType());
        System.out.println(t3.toString());
        System.out.println(t3.getPerimeter());
        System.out.println(t3.printType());

    }

}
