
import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) throws Exception {
        
		// creating the scanner
        Scanner sc = new Scanner(System.in);
		
		// basic code with no error handling
		System.out.print("Enter a double number: ");
        double theDouble = sc.nextDouble();
        System.out.println("You entered : " + theDouble);
		
        // basic code with some error handling
        try {
            System.out.print("Enter a double number: ");
            double myDouble = sc.nextDouble();
            System.out.println("You entered : " + myDouble);
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