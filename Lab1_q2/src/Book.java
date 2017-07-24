/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Book {
    String Name;
    double Price;
    int Qty;
    Author a;
    
    Book(String Name, Author a, double Price, int Qty) {
        this.Name=Name;
        this.a=a;
        this.Price=Price;
        this.Qty=Qty;
    }
    public String getName(){
        return this.Name;
    }
    public double getPrice(){
        return this.Price;
    }
    public int getQty(){
        return this.Qty;
    }
    public Author getAuthor(){
        return this.a;
    }
    public void setQty(int qty){
        this.Qty=this.Qty + qty;
    }
}