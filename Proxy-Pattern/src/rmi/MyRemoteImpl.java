package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    protected MyRemoteImpl(int port) throws RemoteException {
        super(port);
    }

    protected MyRemoteImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Service Say Hello";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        MyRemote remote = new MyRemoteImpl();
        Naming.rebind("RemoteHello", remote);

    }

}
