
import java.util.Scanner;

public class FahrenheitToCelsius {  
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fahr, cels;
		
		try {
			System.out.print("Enter the temperature in Fahrenheit : ");
			fahr = sc.nextDouble();
			cels = ((fahr - 32) * 5) / 9;
			System.out.println(fahr + " Fahrenheit = " + cels + " Degrees");
		}
		catch(Exception ex) {
			System.out.println("ERROR : " + ex);
		}
		
    }
}
