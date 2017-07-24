/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Point {
    double x; double y;
    Point() { this.x = 0.0; this.y = 0.0; }
    Point(double x, double y) { this.x = x; this.y = y; }
    public String Scale() { return "("+Math.round(x/2)+","+Math.round(y/2)+")"; }
    public static void main(String[] args) {
        Point p = new Point(8, 4);
        System.out.println(p.Scale());
    }
}
