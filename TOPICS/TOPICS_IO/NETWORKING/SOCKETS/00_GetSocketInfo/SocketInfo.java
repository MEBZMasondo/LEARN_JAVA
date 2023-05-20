
import java.io.*;
import java.net.*;

public class SocketInfo {  
    public static void main(String[] args) {
		
		
		String str = "www.google.com";

		System.out.println("SOCKET INFORMATION");
		
		try 
		{
			Socket s = new Socket(str, 80); // HTTP service generally runs on port 80 (used by the Web)
			
			System.out.println("ADDRESS 		: " + s.getInetAddress()); 	// the remote InetAddress of the socket
			System.out.println("SERVER PORT 		: " + s.getPort());			// remote port of the socket
			System.out.println("LOCAL ADDRESS 		: " + s.getLocalAddress()); // local InetAddess of the socket
			System.out.println("LOCAL PORT 		: " + s.getLocalPort());	// local InetAddess of the socket
			System.out.println("------------------------------------------------------------------\n");
			s.close();		
		}
		catch (UnknownHostException e) 
		{
			System.out.println("ERROR : Host \"" + str + "\" unkown OR not Found");
		} 
		catch (IOException e) 
		{
				System.out.println("ERROR : IOError");
		}
		catch (Exception e)
		{
			System.out.println("ERROR : " + e);
		}

		
    }
}