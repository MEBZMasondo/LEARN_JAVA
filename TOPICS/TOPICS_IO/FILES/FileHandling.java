
import java.io.*;

public class FileHandling {
   
   public static void main(String[] args) throws Exception {
	   
	  	   
			File file = new File("files/text1.txt");
			boolean fileExists = file.exists();
			long length = file.length();
			System.out.println("FILE EXISTS: " + fileExists); 
			System.out.println("FILE LENGTH: " + length + " bytes"); 
	   
   }
   
}