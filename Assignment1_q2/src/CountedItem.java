/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class CountedItem extends PurchaseItem {
    int quantity;
    
    public CountedItem(){
        super("",0);
        this.quantity=0;
    }
    public CountedItem(String name, double unitprice, int quantity){
        super(name,unitprice);
        this.quantity=quantity;
    }
    @Override
    public double getPrice(){
        return this.quantity*super.getPrice();
    }
    public String toString(){
        String output=super.getName()+" @ "+super.getPrice()+" "+this.quantity+" units "+(int) getPrice()+" SR";
        return output;
    }
}
