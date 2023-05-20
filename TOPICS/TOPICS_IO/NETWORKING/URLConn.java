
import java.net.*;
import java.io.*;

public class URLConn {
   
   public static void main(String[] args) throws Exception {
	   
	   URL url = new URL("http://jenkov.com");
	   
	   URLConnection urlConn = url.openConnection();
	   InputStream input = urlConn.getInputStream();
	   
	   int data =input.read();
	   while(data != -1) {
			System.out.println( (char)data );
			data = input.read();
	   }
	   input.close();
	   
   }
   
}