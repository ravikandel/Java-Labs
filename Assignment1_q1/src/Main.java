
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
    public static void main(String [] args)
    {
        System.out.println("Your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your Id: ");
        input = new Scanner(System.in);
        int id = input.nextInt();
        System.out.println("Your GPA: ");
        input = new Scanner(System.in);
        float gpa = input.nextFloat();
        Student s=new Student(name,id,gpa);
        System.out.println(s.toString());
        System.out.println("Enter New Name: ");
        input = new Scanner(System.in);
        name = input.nextLine();
        s.setName(name);
        System.out.println("After Changing Name: ");
        System.out.println(s.toString());
        Undergrad u=new Undergrad("Ravi",10,3.2,1996);
        System.out.println("Print from Undergrad class as: ");
        System.out.println(u.toString());
        Graduate g=new Graduate("Ravi",11,3.8,"Welcome to Nepal");
        System.out.println("Print from Graduate class as: ");
        System.out.println(g.toString());
        
        
        
        
    }
}
