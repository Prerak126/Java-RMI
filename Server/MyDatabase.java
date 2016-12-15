import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class MyDatabase extends UnicastRemoteObject
        implements MyInterface 
{
	 
	 List<String> fishies;
	private static final long serialVersionUID = 1L;


	public MyDatabase() throws RemoteException 
	{
		super();
	      
			}
		Map<String, List<String>> outdoorElements = new HashMap<String, List<String>>();


		public void myProject(String a, String b)throws RemoteException
		{

	 
			
		
			putObjects (outdoorElements, a, b);
			
			
			
		}
	    
		public void display()throws RemoteException
		{
			for(Map.Entry<String, List<String>> entry : outdoorElements.entrySet())
			{
			System.out.println(entry.getValue() +" "+ entry.getKey()+ "\n");
			}
		}
	
		public Collection<String> lastName(String key)throws RemoteException
		{
			fishies = outdoorElements.get(key);
			System.out.println("Student(s) with first name "+ key + " has last name: " + fishies);
			return fishies;
		}

		public void putObjects (Map<String, List<String>> outdoorElements, String key, String value)throws RemoteException 
		{
			List<String> myClassList = outdoorElements.get(key);
			if(myClassList == null) {
	        myClassList = new ArrayList<String>();
	        outdoorElements.put(key, myClassList);
	    }
	    myClassList.add(value);
	   
	
	}
}

