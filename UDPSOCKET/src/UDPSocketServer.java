/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/**
 *
 * @author Ravi Kandel
 */
public class UDPSocketServer {

    DatagramSocket socket = null;

    

    public void createAndListenSocket() {
        try {
            socket = new DatagramSocket(9876);
            byte[] incomingData = new byte[1024];

            while (true) {
                DatagramPacket incomingPacket = new DatagramPacket(incomingData, incomingData.length);
                socket.receive(incomingPacket);
                
                String message = new String(incomingPacket.getData());
                System.out.println("Client Says: " + message);
                
                
                InetAddress IPAddress = incomingPacket.getAddress();
                int port = incomingPacket.getPort();
                String replyMessage = "Thank you for the message";
                
                byte[] outgoingData = replyMessage.getBytes();
                DatagramPacket outgoingPacket
                        = new DatagramPacket(outgoingData, outgoingData.length, IPAddress, port);
                socket.send(outgoingPacket);
                
                
            }

        }  catch (SocketException e) {
            System.out.println("Socket Error: " + e.toString());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.toString());
        }
        socket.close();
    }

    public static void main(String[] args) {
        UDPSocketServer server = new UDPSocketServer();
        server.createAndListenSocket();
        
    }
}
