package de.mhaeusser.rmi;

import java.rmi.Naming;

/** from https://en.wikipedia.org/wiki/Java_remote_method_invocation (where I made a minor edit along the way) */
public class RmiClient {

    public static void main(String args[]) throws Exception {
        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//localhost/RmiServer");
        System.out.println(obj.getMessage()); 
    }
}
