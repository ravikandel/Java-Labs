
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
public class LoginWindow1 extends JFrame {
    JTextField txtUserName;
    JTextField txtPassword;
    public LoginWindow1(){
        super("Login 1");
        //define Layout
        FlowLayout layout = new FlowLayout();
        //defining Conponents
        JLabel lblUser = new JLabel("User Name: ");
        JLabel lblPassword = new JLabel("Password: ");
        txtUserName=new JTextField("",10);
        txtPassword=new JPasswordField("",10);
        JButton btnLogin1 = new JButton("LOGIN");
        //configure listner to button
        btnLogin1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent event){
        String username=txtUserName.getText();
        String password=txtPassword.getText();
        
/*      System.out.println("User Name: "+username);
        System.out.println("Password: "+password);
*/      
        JOptionPane.showMessageDialog(null, "User Name: "+username+"\nPassword: "+password);
    }
    });
        //getting container to set layout
        Container pane=getContentPane();
        pane.setLayout(layout);
        //defining the size of the field;
//        txtUserName.setPreferredSize(new Dimension(100,20));
//        txtPassword.setPreferredSize(new Dimension(100,20));
        //adding components in order
        pane.add(lblUser);
        pane.add(txtUserName);
        pane.add(lblPassword);
        pane.add(txtPassword);
        pane.add(btnLogin1);
        //defining size of the layout
        this.setSize(500,200);
        //for visibility of layout
        this.setVisible(true);
    }
    
    
        public static void main(String []args){
        LoginWindow demo=new LoginWindow();//used to run the
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// used to exit the program when we clicked top cross button
    }
        
}
