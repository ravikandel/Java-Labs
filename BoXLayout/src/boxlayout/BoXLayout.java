/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxlayout;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ravi Kandel
 */
public class BoXLayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public BoXLayout(){
        super("Box Layout");
        Container pane = getContentPane();
        BoxLayout blayout = new BoxLayout(pane,BoxLayout.X_AXIS );
        pane.setLayout(blayout);
        JButton button[] = new JButton[5];
        
        for( int i=0;i<5;i++){
            button[i]= new JButton();
            button[i].setText("Button");
            pane.add(button[i]);
            
        }
        this.setSize(300,300);
        this.setVisible(true);
        
        
        
        
    }
             
          
    public static void main(String[] args) {
        // TODO code application logic here
        BoXLayout b = new BoXLayout();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
