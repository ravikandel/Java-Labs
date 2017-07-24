
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class BorderLayoutDemo extends JFrame{
    String options[]={"Male","Female"};
    
    public BorderLayoutDemo(){
        super("Border Layout Demo");
        BorderLayout layout = new BorderLayout();
        Container pane =getContentPane();//makes the container in frame
        pane.setLayout(layout);
        
        JTextField textNorth=new JTextField();
        
        JButton buttonCenter = new JButton("Button is in Center.");
        JComboBox comboSouth = new JComboBox(options);
        pane.add(textNorth,BorderLayout.NORTH);
        pane.add(buttonCenter,BorderLayout.CENTER);
        pane.add(comboSouth,BorderLayout.SOUTH);
        this.setSize(600,600);
        this.setVisible(true);
    }
    public static void main(String []args){
        BorderLayoutDemo demo=new BorderLayoutDemo();//used to run the
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// used to exit the program when we clicked top cross button
    }
}
