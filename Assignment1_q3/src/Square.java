/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Square extends Shape implements Area {
    double side;
    Square(){
        super("");
        this.side=0;
    }
    Square(String name,double side){
        super(name);
        this.side=side;
    }
    @Override
    public double getArea(){
        return Math.pow(this.side, 2);
    }
}
