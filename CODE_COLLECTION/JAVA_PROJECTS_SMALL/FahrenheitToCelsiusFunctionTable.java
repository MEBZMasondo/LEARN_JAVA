
public class FahrenheitToCelsiusFunctionTable {  
    public static void main(String[] args) {
		
		double cels;
		
		System.out.println("FAHRENHEIT CELCIUS" );
		
		for(int fah = 0; fah <= 100; fah+=10) {
			
			Double fahD = new Double(fah);
			cels = farhToCels(fahD);
			
			/*
			String resultFah = String.format("%.2f", fahD);
			String resultCel = String.format("%.2f", cels);
			System.out.println(resultFah + " " + resultCel);
			*/
			
			String line = String.format("%20f", fahD );
			System.out.println(line);			
		}
    }
	
	// METHOD(S)
	public static double farhToCels(double temperature) {
		return ((temperature - 32) * 5) / 9;
	}
}