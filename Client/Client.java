import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;

public class Client 
{


    public static void main(String[] args) 
    {
	        System.setSecurityManager(new RMISecurityManager());
	 
        try 
        {
                   System.out.println("\nClient INITIALIZED... ");	
        	        	
            MyInterface stub= (MyInterface)Naming.lookup("rmi://192.168.1.9:5000/studentrecord");
        	System.out.println("\nReceived Skeleton...");
           
            Scanner sc= new Scanner(System.in);
		String a ="";
           
         
				while(true)
			{
				
				System.out.println("\n Enter the First name of Student whose Last name(s) will be found:-");
         
				a=sc.next();
				Collection<String> last =stub.lastName(a);

				System.out.println("The student in class with the first name "+ a + " has a last name of "+last);
				
				System.out.println("\n \n Do you wish to search for another student in the class? ");
				System.out.println("Please enter Yes or No");
				String j= sc.next();
				String f="Yes";
				if(j.equals(f))
				{
					continue;
				}
				else{
					System.out.println("Thank you for accessing the class list");
					break;}
			
			}
		}		
     catch (ConnectException conEx) 
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.exit(1);
        }
	
	}
}
