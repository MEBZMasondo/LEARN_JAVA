import java.util.Scanner;

public class FahrenheitToCelsiusFunction {  
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fahr, cels;
		
		try {
			System.out.print("Enter the temperature in Fahrenheit : ");
			fahr = sc.nextDouble();
			cels = farhToCels(fahr);	// Method call
			System.out.println(fahr + " Fahrenheit = " + cels + " Degrees");
		}
		catch(Exception ex) {
			System.out.println("ERROR : " + ex);
		}
		
    }
	
	// METHOD(S)
	public static double farhToCels(double temperature) {
		return ((temperature - 32) * 5) / 9;
	}
}