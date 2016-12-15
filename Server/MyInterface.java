import java.rmi.*;
import java.util.*;

public interface MyInterface extends Remote
{
    public Collection<String> lastName(String key) throws RemoteException;
    public void myProject(String p, String q)throws RemoteException;
	
}
