/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ravi Kandel
 */
public class UDPServer {
    
    DatagramSocket socket = null;
    
    public void createlisten() throws IOException
    {
        try {
            socket = new DatagramSocket(9847);
           byte [] inbyte= new byte[1024];
           
            while (true) {   
                DatagramPacket inPacket = new DatagramPacket(inbyte, inbyte.length);
                socket.receive(inPacket);
                
                String incoming_msg = new String(inPacket.getData());
                
                System.out.println("Client Says: " +incoming_msg);
                
                InetAddress ia = inPacket.getAddress();
                int port  = inPacket.getPort();
                
               String reply = new String("Thank you for your Message");
               
               byte [] msg_out = reply.getBytes();
               
               DatagramPacket outPacket = new DatagramPacket(msg_out, msg_out.length, ia, port);
               socket.send(outPacket);
                
            }
            
            
            
        } catch (SocketException ex) {
            System.out.println("Socket Error: " + ex.toString());
        }
        
    }
    
    public static void main(String[] args) {
        UDPServer server = new UDPServer();
        try {
            server.createlisten();
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
