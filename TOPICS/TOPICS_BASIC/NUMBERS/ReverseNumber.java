
/*
	Reverse an integer number
*/
public class ReverseNumber {  
    public static void main(String[] args) {
		
		int num = 123;
        System.out.println("The reverse of " + num + " is " + reverseNumber(num));
    }
	
	public static int reverseNumber(int number) {
		
		String reverse = "";
		while(number > 0) {
			reverse += String.valueOf((Integer)(number%10));
			number /= 10; 
		}
		
		//return Integer.valueOf(reverse);
		return Integer.parseInt(reverse);
	}
}