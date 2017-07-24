
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ravi Kandel
 */
public class Calculator extends JFrame implements ActionListener {

    double temporary[] = {0, 0};
    boolean function[] = {false, false, false, false, false};
    JTextArea txtResult;
    JPanel buttonPanel;
    JButton buttons[] = new JButton[20];
    String[] buttonString = {"CE", "C", "<-", "%",
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"};

    public Calculator() {
        super("Calculator");
        BorderLayout mainLayout = new BorderLayout();
        GridLayout buttonLayout = new GridLayout(5, 4);

        Container pane = getContentPane();
        pane.setLayout(mainLayout);

        txtResult = new JTextArea();
        txtResult.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        pane.add(txtResult, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(buttonLayout);

        Font f = new Font("Century Gothic", Font.PLAIN, 16);
        for (int i = 0; i < 20; i++) {
            buttons[i] = new JButton();
            buttons[i].setText(buttonString[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(f);
        }
        pane.add(buttonPanel, BorderLayout.CENTER);
        this.setSize(250, 350);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == buttons[4]) {
            txtResult.append("7");
        }
        if (event.getSource() == buttons[5]) {
            txtResult.append("8");
        }
        if (event.getSource() == buttons[6]) {
            txtResult.append("9");
        }
        if (event.getSource() == buttons[8]) {
            txtResult.append("4");
        }
        if (event.getSource() == buttons[9]) {
            txtResult.append("5");
        }
        if (event.getSource() == buttons[10]) {
            txtResult.append("6");
        }
        if (event.getSource() == buttons[12]) {
            txtResult.append("1");
        }
        if (event.getSource() == buttons[13]) {
            txtResult.append("2");
        }
        if (event.getSource() == buttons[14]) {
            txtResult.append("3");
        }
        if (event.getSource() == buttons[16]) {
            txtResult.append("0");
        }
        if (event.getSource() == buttons[3]) {//for modulas operations
            temporary[0] = Double.parseDouble(txtResult.getText());
            function[0] = true;
            txtResult.setText("");
        }
        if (event.getSource() == buttons[7]) {// for division operations
            temporary[0] = Double.parseDouble(txtResult.getText());
            function[1] = true;
            txtResult.setText("");
        }
        if (event.getSource() == buttons[11]) {// for multiplication operations
            temporary[0] = Double.parseDouble(txtResult.getText());
            function[2] = true;
            txtResult.setText("");
        }
        if (event.getSource() == buttons[15]) {// for subtraction
            temporary[0] = Double.parseDouble(txtResult.getText());
            function[3] = true;
            txtResult.setText("");
        }
        if (event.getSource() == buttons[19]) {// for addition
            temporary[0] = Double.parseDouble(txtResult.getText());
            function[4] = true;
            txtResult.setText("");
        }
        if (event.getSource() == buttons[18]) {// for equal to button
            getResult();
        }
        if (event.getSource() == buttons[0]) {// for CE button
            System.exit(0);
        }
        if (event.getSource() == buttons[1]) {// for C button
            txtResult.setVisible(true);
            txtResult.setText("");
            temporary[0] = 0;
            temporary[1] = 0;
        }
        if (event.getSource() == buttons[17]) {// for . button
            txtResult.append(".");
        }
        if (event.getSource() == buttons[2]) {// for . button
            //txtResult.append(".");
            if (txtResult.getText().length() > 0) {
                StringBuffer sb = new StringBuffer(txtResult.getText());
                sb = sb.deleteCharAt(txtResult.getText().length() - 1);
                txtResult.setText(sb.toString());
            }
        }
    }

    public void getResult() {
        double result = 0;
        temporary[1] = Double.parseDouble(txtResult.getText());
        if (function[0] == true) {
            result = temporary[0] % temporary[1];
            function[0] = false;
        }
        if (function[1] == true) {
            result = temporary[0] / temporary[1];
            function[1] = false;
        }
        if (function[2] == true) {
            result = temporary[0] * temporary[1];
            function[2] = false;
        }
        if (function[3] == true) {
            result = temporary[0] - temporary[1];
            function[3] = false;
        }
        if (function[4] == true) {
            result = temporary[0] + temporary[1];
            function[4] = false;
        }

        txtResult.setText(Double.toString(result));
    }

//main Program
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
