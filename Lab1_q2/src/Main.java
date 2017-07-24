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

    public static void main(String [] args) {
        Author athr = new Author("Ravi Kandel", "ravkdl@gmail.com", 'M');
//        System.out.println("Author Name: " +athr.getName());
//        System.out.println("Author Email: "+athr.getEmail());
//        System.out.println("Author Gender: "+athr.getGender());   
        Book bk = new Book("Advanced Java",athr,1200,10);
        System.out.println("Book Name= "+bk.getName());
        System.out.println("Book Price= "+bk.getPrice());
        System.out.println("Book Quantity= "+bk.getQty());
        
        Author ath=bk.getAuthor();
        System.out.println("Author Name= "+ath.getName());
        System.out.println("Author Email= "+ath.getEmail());
        System.out.println("Author Gender= "+ath.getGender());
        
    }
}
