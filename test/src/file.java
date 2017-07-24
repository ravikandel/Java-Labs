
import java.io.FileReader;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class file {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("E:\\a.txt");
            FileWriter fw = new FileWriter("E:\\b.txt");
            int a;
            
            while((a=fr.read())!=-1)
            {
                fw.write(a);
               
            }
            fr.close();
            fw.close();
            
        }
        catch(Exception ex){
            
        }
    }
    
}
