JAVA RMI
Prerakkumar Doshi
Tanvir Talukder


INSTRUCTIONS TO RUN JAVA RMI
===========================================
Two folders:
Client
	MyInterface.java
	Client.java
	Client.policy
Server
	MyInterface.java
	MyDatabase.java
	Server.java
	Server.policy

1) Please execute the following commands in a command prompt in "Server" directory
	javac *.java	 (compile)
	rmic MyDatabase  (creates stub)
	rmiregistry 5000 (binds registry to port 5000)

2) Please open another command prompt and execute the following in "Server directory"
	java -Djava.security.policy=Server.policy Server

*******IMPORTANT*******
3) Please send the MyDatabase_stub.class file to your "Client directory" at the separate host.
*******IMPORTANT*******

4) Please open another command prompt on the separate host and execute the following in "Client directory"
	javac *.java
	java -Djava.security.policy=Client.policy Client

IMPORTANT:
Please run Client and Server from their respective directories and please change the IP address to your network IP address.

Line to change IP address given below:
“rmi://192.168.1.9:5000/studentrecord” 

Please replace "192.168.1.9" with your IP address, everything else remains the same.
