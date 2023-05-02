import java.util.Scanner;

public class InputFloat {
    public static void main(String[] args) throws Exception {
        
		// creating the scanner
        Scanner sc = new Scanner(System.in);
		
		// basic code with no error handling
		System.out.print("Enter a float number: ");
        float theFloat = sc.nextFloat();
        System.out.println("You entered : " + theFloat);
		
        // basic code with some error handling
        try {
            System.out.print("Enter a float number: ");
            float myFloat = sc.nextFloat();
            System.out.println("You entered : " + myFloat);
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