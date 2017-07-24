/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class PurchaseItem {
    private String name;
    private double UnitPrice;
    
    PurchaseItem(){
        this.name="no item";
        this.UnitPrice=0;
    }
    PurchaseItem(String name, double unitprice){
        this.name=name;
        this.UnitPrice=unitprice;
    }
    public double getPrice(){
        return this.UnitPrice;
    }
    public void setPrice(double unitprice){
        this.UnitPrice=unitprice;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return name+" @ "+UnitPrice;
    }
    
}
