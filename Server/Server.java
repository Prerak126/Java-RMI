import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.rmi.*;
import java.util.*;

public class Server {
public static void main(String args[]) {
		System.setSecurityManager(new RMISecurityManager());
		System.out.println("\n \n Server INITIALIZED...");
		
		try {
			MyDatabase skeleton = new MyDatabase();
			
			
			Naming.rebind("rmi://192.168.1.9:5000/studentrecord",skeleton);
             Scanner sc= new Scanner(System.in);
           
            System.out.println("\n \n JAVA RMI CLIENT-SERVER PROJECT");
			System.out.println("=======================================");
			System.out.println("\n \n By Prerakkumar Doshi and Tanvir Talukder");
			
			
			
				
            String p,q,a ="";
            
				
			
			
				System.out.println("\n Enter total number of students in class: ");
				int n= sc.nextInt();
				for(int i=0; i<n; i++)
				{
					System.out.println("\n Enter the First name of the Student:-");
					p=sc.next();
					System.out.println("\n Enter the Last name of the Student:-");
					q= sc.next();
					skeleton.myProject(p,q);
					
				}	

		System.out.println("\n\n\nClass List of Students is stored");
			System.out.println("==============\n");
			
			skeleton.display();
			
		System.out.println("\n\n\nBelow are the searches by client");

		} catch(Exception e) {
			System.out.println(e);
		}
       }
}
