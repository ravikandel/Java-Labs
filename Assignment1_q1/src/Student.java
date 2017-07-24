/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Student {
    String name;
    int id;
    double gpa;
    
    Student()
    {
        this.name="";
        this.id=0;
        this.gpa=0;
    }
    Student(String name, int id, double gpa)
    {
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public String getName(){
        return this.name;
    }
    public double getGPA(){
        return this.gpa;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "ID: "+this.id+" NAME: "+this.name+" GPA: "+(float) this.gpa;
    }
}
