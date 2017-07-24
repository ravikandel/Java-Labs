/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Graduate extends Student {
 String thesisTitle;
    Graduate(){
        super("",0,0);
        this.thesisTitle="";
    }
    Graduate(String name, int id, double gpa, String thesistitle ){
        super(name,id,gpa);
        this.thesisTitle=thesistitle;
    }
 
    public void setThesisTitle(String thesisTitle){
        this.thesisTitle=thesisTitle;
    }
    public String getThesisTitle(){
        return this.thesisTitle;
    }
    @Override
       public String toString(){
           return "THESIS TITLE: "+this.thesisTitle+" "+super.toString();
       }
}
