/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class WeighedItem extends PurchaseItem{
    double weight;
    
    WeighedItem(){
        super("",0);
        this.weight=0;
    }
    public WeighedItem(String name, double unitprice, double weight){
        super(name,unitprice);
        this.weight=weight;
    }
    @Override
    public double getPrice(){
        return this.weight*super.getPrice();
    }
    public String toString(){
        String output=super.getName()+" @ "+super.getPrice()+" "+this.weight+"Kg "+(double) getPrice()+" SR";
        return output;
    }
}
