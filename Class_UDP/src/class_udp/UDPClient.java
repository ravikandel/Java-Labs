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
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ravi Kandel
 */
public class UDPClient {

    DatagramSocket socket = null;
    InetAddress ia = null;

    public void createlisten() throws UnknownHostException {

        try {
            socket = new DatagramSocket();
            ia = InetAddress.getByName("localhost");

            byte[] msgout;
            byte[] msgin;
            System.out.println("Client: ");
            Scanner in = new Scanner(System.in);
            String data = in.nextLine();

            msgout = data.getBytes();

            DatagramPacket outPacket = new DatagramPacket(msgout, msgout.length, ia, 9847);

            socket.send(outPacket);
            
            msgin= new byte[1024];
            DatagramPacket inPacket= new DatagramPacket(msgin, msgin.length);
            socket.receive(inPacket);
            String response= new String(inPacket.getData());
            System.out.println("Server says: " +response);
            
            

        } catch (SocketException ex) {
            System.out.println("Socket Error: " + ex.toString());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.toString());
        }

        socket.close();
    }
    
    public static void main(String[] args) {
        UDPClient client = new UDPClient();
        try {
            client.createlisten();
        } catch (UnknownHostException ex) {
            System.out.println("Clinet Error: " + ex.toString());
        }
    }
}
