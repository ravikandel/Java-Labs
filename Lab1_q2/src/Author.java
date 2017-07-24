/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class Author {
    String NAME;
    String EMAIL;
    char GENDER;
    
    Author()
    {
       this.NAME="";
       this.EMAIL="";
       this.GENDER=' ';
       
    }
    Author(String NAME, String EMAIL,char GENDER)   {
       this.NAME=NAME;
       this.EMAIL=EMAIL;
       this.GENDER=GENDER;  
    }
    public String getName() {
        return this.NAME;
    }
    public String getEmail() {
        return this.EMAIL;
    }
    public char getGender()  {
        return this.GENDER;
    }
}
