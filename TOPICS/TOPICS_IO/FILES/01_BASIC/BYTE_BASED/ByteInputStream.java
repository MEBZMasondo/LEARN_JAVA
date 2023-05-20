/*
For reading byte baseddata one byte at a time 
*/

import java.io.*;

public class ByteInputStream {
   
   public static void main(String[] args) throws Exception {
	   
		InputStream input= new FileInputStream("files/text1.txt");
		
		int data = input.read();
		
		while(data != -1) {
				System.out.print((char)data); // without the char type casting it would print numbers
				data = input.read();
		}
		
		input.close();
	   
   }
   
}