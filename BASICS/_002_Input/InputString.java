package _002_Input;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) throws Exception {
        
        String fullName;
        String nickName;

        Scanner sc = new Scanner(System.in);

        // To accept multiple strings(words)
        try {
            System.out.print("Enter Your names separated by a white space:");
            fullName = sc.nextLine();
            System.out.println("You entered : " + fullName);
        } 
        catch(Exception ex) 
        {
            System.out.println( "ERROR: " + ex);   
        } 
        finally {

        }
       
        // To accept a single string
        try {
            System.out.print("Enter Your nick name (will accept one ):");
            nickName = sc.next();
            System.out.println("You entered : " + nickName);
        } 
        catch(Exception ex) {
            System.out.println( "ERROR: " + ex.toString());
        } 
        finally {

        }
        
        sc.close();
    }
}
