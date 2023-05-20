
import java.io.*;
import java.util.*;

class LineCountP {
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("files/text.txt");
		Scanner fli = new Scanner(myFile);
		PrintWriter fo = new PrintWriter("files/output.txt");

		// line count
		int lc = 0;
		while(fli.hasNextLine()) {
			String line = fli.nextLine();
			lc++;
		}
		
		fli.close();
		System.out.println("lines counted = " + lc);
		fo.println("lines counted = " + lc);

		// word count
		Scanner fwi = new Scanner(myFile);
		int wc = 0;
		while(fwi.hasNext()) {
			String word = fwi.next();
			wc++;
		}
		fwi.close();
		System.out.println("words counted = " + wc);
		fo.println("words counted = " + wc);

		// char count
		Scanner fic = new Scanner(myFile);
		int charCount = 0; 
		while(fic.hasNext()) {
			String wordIn = fic.next();
			char myChar;
			for(int i = 0; i < wordIn.length() ; i++) {
				myChar = wordIn.charAt(i);
				charCount++;
			} 
		}

		fic.close();
		System.out.println("chararacters counted = " + charCount);
		fo.println("chararacters counted = " + charCount);

		fo.close();
	}
}