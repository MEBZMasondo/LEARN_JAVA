/*
For reading byte baseddata one byte at a time 
*/

import java.io.*;

public class ByteInputStreamByteArray {
   
   public static void main(String[] args) throws Exception {
	   
	   InputStream inputstream = new FileInputStream("files/text1.txt");

		byte[] data      = new byte[1024];
		int    bytesRead = inputstream.read(data);
	
		System.out.println(bytesRead);
	
		while(bytesRead != -1) {
			System.out.print(bytesRead);

			bytesRead = inputstream.read(data);
		}
		inputstream.close();
		
		System.out.println();
		
		for(int i = 0; i < data.length ; i++) {
			System.out.print((char)data[i]);
		}
   }
   
}