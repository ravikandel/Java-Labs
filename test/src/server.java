
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
public class server extends JFrame implements ActionListener {

    static JTextArea txt_messages;
    JTextField txt_input;
    JButton btn_send;
    JLabel heading;

    static DatagramSocket ds;
    static DatagramPacket out_packet;
    static DatagramPacket in_packet;
//    private static Thread th = null;

    public server() {
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

    public static void main(String[] args) throws Exception {
        server se = new server();
        se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // required to send and receive data through Datagram Socket
        ds = new DatagramSocket(50000); // port number is important  nad must be same

//        th = new Thread();
//        th.setDaemon(true);
//        th.start();
        while (true) {
            byte[] msg_in = new byte[1024];
            in_packet = new DatagramPacket(msg_in, msg_in.length); //to receive bytes from client
            try {
                ds.receive(in_packet); // to receive data bytes frm client. in_packet holda data bytes 
            } catch (IOException ex) {
                System.out.println("Server Receiving Error: " + ex.toString());
            }

            String msg = new String(in_packet.getData());// extracts received bytes to string
            txt_messages.append("CLIENT: " + msg.trim() + " \n");

        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn_send) {
            try {

                String aa = new String(txt_input.getText().trim());

                byte[] msg_out = aa.getBytes(); // to send bytes out to server
                InetAddress ia = InetAddress.getLocalHost();// to get the internet address for local host

                out_packet = new DatagramPacket(msg_out, msg_out.length, ia, in_packet.getPort());// (message byte, message bytelength, ip,port) holds bytes to be sent
                ds.send(out_packet);// sending dp through the socket

                txt_messages.append("SERVER: " + txt_input.getText() + "\n");
                txt_input.setText("");

            } catch (Exception ex) {
                System.out.println("Server Sending Error: " + ex.toString());
            }
        }

    }

//    @Override
//    public void run() {
//        
//    }
}
