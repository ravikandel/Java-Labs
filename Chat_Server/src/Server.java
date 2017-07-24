
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultCaret;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ravi Kandel
 */
public class Server extends JFrame implements ActionListener {

    static JTextArea txt_messages;
    JTextField txt_input;
    JButton btn_send;
    JLabel heading;

    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static String msgin = "";
    static String msgout = "";

    public Server() {
        super("Chat Server");
        BorderLayout Blayout = new BorderLayout();
        FlowLayout Flayout = new FlowLayout();

        Container pane = getContentPane();
        pane.setLayout(Blayout);

        JPanel Lowerpanel = new JPanel();
        Lowerpanel.setLayout(Flayout);

        heading = new JLabel("This is Chat Server");
        heading.setFont(new Font("Century Gothic", Font.BOLD, 36));

        txt_messages = new JTextArea();
        txt_messages.setFont(new Font("Century Gothic", Font.PLAIN, 18));

        txt_messages.setColumns(10);
        txt_messages.setRows(10);
        txt_messages.setLineWrap(true);
        txt_messages.setWrapStyleWord(true);
        txt_messages.setEditable(false);
        JScrollPane scroll = new JScrollPane(txt_messages);
        scroll.setSize(300, 600);
        DefaultCaret caret = (DefaultCaret) txt_messages.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        txt_input = new JTextField("", 20);
        txt_input.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        txt_input.addActionListener(this);

        btn_send = new JButton("SEND");

        Lowerpanel.add(txt_input);
        Lowerpanel.add(btn_send);

        btn_send.addActionListener(this);

        pane.add(heading, BorderLayout.NORTH);
        pane.add(scroll, BorderLayout.CENTER);
        pane.add(Lowerpanel, BorderLayout.SOUTH);

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        Server se = new Server();
        se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            //Just for establishing connection.
            ss = new ServerSocket(6789); //Should be same in both server and client

            //For communication we use normal Socket... Always use Socket for communication...
            s = ss.accept();

            //To sent to Client
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while (true) {
                msgin = din.readUTF();
                txt_messages.append("CLIENT: " + msgin + "\n");

                //System.out.println(txt_messages);
            }

        } catch (Exception ex) {

        }

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn_send) {
            try {
                msgout = txt_input.getText();

                dout.writeUTF(msgout);
                txt_messages.append("RAVI: " + msgout + "\n");
                txt_input.setText("");
                dout.flush();
//                txt_messages.setText(msgout);
            } catch (Exception ex) {

            }
        }

        /*txt_messages.append("Server: " + txt_input.getText().toString() + "\n CLIENT: ");
            txt_input.setText("");*/
    }

}
