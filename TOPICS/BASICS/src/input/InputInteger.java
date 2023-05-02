
import java.util.Scanner;

public class InputInteger {
	public static void main(String[] args) throws Exception {
        
		// creating the scanner
		Scanner sc = new Scanner(System.in);
		
		// basic code with no error handling
		System.out.print("Enter an integer number: ");
		int theInt = sc.nextInt();
		System.out.println("You entered : " + theInt);
		
		// basic code with some error handling
		try {
			System.out.print("Enter an integer number: ");
			int myInt = sc.nextInt();
			System.out.println("You entered : " + myInt);
		} 
		catch(Exception ex) 
		{
			System.out.println( "ERROR: " + ex);   
		} 
		finally {

		}
       
		sc.close();
	}
}
