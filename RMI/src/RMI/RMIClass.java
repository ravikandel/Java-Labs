/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ravi Kandel
 */
public class RMIClass extends UnicastRemoteObject implements RMIInterface{
    
    public RMIClass() throws RemoteException{
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }
    
    
    
}
