
import java.io.*;
import java.net.*;

public class GreetServerSocket {  
    public static void main(String[] args) {
		
		System.out.println("**** The server is running and listening for clients ****");
		try 
		{
			ServerSocket ss = new ServerSocket(9000);
			Socket s = ss.accept(); // connection
			
			DataInputStream di = new DataInputStream(s.getInputStream());
			
			String inputStr = (String)di.readUTF();
			
			System.out.println("MESSAGE : "+ inputStr);
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
    }
}
