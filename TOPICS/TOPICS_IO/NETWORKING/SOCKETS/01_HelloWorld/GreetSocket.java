
import java.io.*;
import java.net.*;

public class GreetSocket {  
    public static void main(String[] args) {
		
		System.out.println("**** The client is running ****");
		try 
		{
			Socket s = new Socket("localhost", 9000);
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			dos.writeUTF("Hello World");
			dos.flush();
			dos.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
    }
}
