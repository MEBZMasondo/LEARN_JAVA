
import java.io.*;
import java.net.*;

public class MessageClient {  
    public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost", 9000);  
		
		DataInputStream dis = new DataInputStream(s.getInputStream());  
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
		String s1 = "", s2 = "";  
		while(!s1.equals("stop")) {  
			s1 = br.readLine();  
			dos.writeUTF(s1);  
			dos.flush();  
			s2 = dis.readUTF();  
			System.out.println("The Server says: " + s2);  
		}  
  
		dos.close();  
		s.close();  
		
    }
}
