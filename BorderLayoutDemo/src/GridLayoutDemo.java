
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class GridLayoutDemo extends JFrame {
    
    String numpadContent[]={"7","8","9","4","5","6","1","2","3","0",".","CLR"};
    public GridLayoutDemo(){
        super("Simple Calculator");
        GridLayout layout=new GridLayout(4,3,10,10);
        Container pane =getContentPane();//makes the container in frame
        pane.setLayout(layout);
        
        JButton buttons[] = new JButton[12];
        for(int i=0;i<12;i++){
            buttons[i] = new JButton(numpadContent[i]);
            pane.add(buttons[i]);
        }

        this.setSize(300,450);
        this.setVisible(true);
    }
    public static void main(String []args){
        
        GridLayoutDemo demo=new GridLayoutDemo();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
