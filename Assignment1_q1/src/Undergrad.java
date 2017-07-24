/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Undergrad extends Student {
    int year;
    Undergrad(){
        super(" ",0,0);
        this.year=0;
    }
    Undergrad(String name, int id, double gpa, int year ){
        super(name,id,gpa);
        this.year=year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    @Override
    public String toString(){
        return "YEAR: "+this.year+" "+super.toString();
    }
    
}
