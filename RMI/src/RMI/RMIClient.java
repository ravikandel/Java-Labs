/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ravi Kandel
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.0.7",2121);
            RMIInterface client = (RMIInterface)registry.lookup("registry");
            
            int sum = client.add(5,4);
            int diff= client.sub(10,2);
            
            System.out.println("Sum: "+sum +"\n Call From: "+client.getClass().getName());
            System.out.println("Diff: "+diff);
            
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("Remote Exception in Client: "+ex.toString());
        }
        
    }
    
}
