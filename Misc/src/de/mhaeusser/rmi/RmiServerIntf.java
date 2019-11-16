package de.mhaeusser.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiServerIntf extends Remote {

    String getMessage(String name) throws RemoteException;
}
