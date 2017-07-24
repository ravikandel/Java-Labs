
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
    public static void main(String [] args){
        System.out.println("Enter the color: ");
        Scanner input=new Scanner(System.in);
        String color=input.nextLine();
        System.out.println("Enter the value for filled(true/false): ");
        input=new Scanner(System.in);
        boolean filled=input.nextBoolean();
        Shape s=new Shape();//empty constructor
        s.setColor(color);//using setter function
        s.setFilled(filled);//using setter function
        System.out.println(s.toString());
        Circle c = new Circle();
        System.out.println(c.toString());
        System.out.println(c.getArea());
        Square sq=new Square(2);
        System.out.println(sq.toString());
        
    }
}
