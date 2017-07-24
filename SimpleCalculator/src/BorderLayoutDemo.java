
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
    
    String numpadContent[]={"7","8","9","4","5","6","1","2","3","0",".","CLR"};
    public BorderLayoutDemo(){
        super("Simple Calculator");
        BorderLayout layout = new BorderLayout();
        Container pane =getContentPane();//makes the container in frame
        pane.setLayout(layout);
        JTextField textNorth=new JTextField("0");// sets the length of input field to the length of 9 digit
        textNorth.setPreferredSize(new Dimension(0,30));
        textNorth.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);//right to left align of display field
        pane.add(textNorth,BorderLayout.NORTH);
        JPanel keyPanel= new JPanel();
        GridLayout Glayout=new GridLayout(4,3,10,10);      
        keyPanel.setLayout(Glayout);
        JButton buttons[] = new JButton[12];
        for(int i=0;i<12;i++){
            buttons[i] = new JButton(numpadContent[i]);
            keyPanel.add(buttons[i]);
        }
        pane.add(keyPanel,BorderLayout.CENTER);
        this.setSize(250,350);
        this.setVisible(true);
    }
    
    

}
