/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Ravi Kandel
 */
public class UDPSocketClient {

    DatagramSocket Socket;


    public void createAndListenSocket() {
        try {

            Socket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");
            byte[] incomingData = new byte[1024];

            System.out.println("Client: ");
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            byte[] outgoingData = sentence.getBytes();
            DatagramPacket outgoingPacket = new DatagramPacket(outgoingData, outgoingData.length, IPAddress, 9876);
            Socket.send(outgoingPacket);

            System.out.println("Message sent from client");

            DatagramPacket incomingPacket = new DatagramPacket(incomingData, incomingData.length);
            Socket.receive(incomingPacket);

            String response = new String(incomingPacket.getData());
            System.out.println("Server Says: " + response);
            Socket.close();

        }  catch (SocketException e) {
            System.out.println("Socket Error: " + e.toString());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.toString());
        }
    }

    public static void main(String[] args) {
        UDPSocketClient client = new UDPSocketClient();
        client.createAndListenSocket();
    }
}
