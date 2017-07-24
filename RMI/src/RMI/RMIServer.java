/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author Ravi Kandel
 */
public class RMIServer {
    public static void main(String[] args) {
        try {
            RMIClass server = new RMIClass();
            Registry registry = LocateRegistry.createRegistry(2121);
            registry.rebind("registry", server);
            
        } catch (RemoteException ex) {
            System.out.println("Remote Exception in Server: "+ex.toString());
        }
    }
    
}
