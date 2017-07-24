
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class test extends JFrame {
     public test(){
        super("Test Border Layout");
        BorderLayout layout = new BorderLayout();
        Container pane =getContentPane();//makes the container in frame
        pane.setLayout(layout);
        
        JButton textNorth=new JButton("North");
        JButton textSouth=new JButton("South");
        JButton textEast=new JButton("East");
        JButton textWest=new JButton("West");
        JButton textCenter=new JButton("Center");
        
        pane.add(textNorth,BorderLayout.NORTH);
        pane.add(textCenter,BorderLayout.CENTER);
        pane.add(textSouth,BorderLayout.SOUTH);
        pane.add(textEast,BorderLayout.EAST);
        pane.add(textWest,BorderLayout.WEST);
        this.setSize(600,600);
        this.setVisible(true);
    }
    public static void main(String []args){
        test demo=new test();//used to run the
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// used to exit the program when we clicked top cross button
    }
}
