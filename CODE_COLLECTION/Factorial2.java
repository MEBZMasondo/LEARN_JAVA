
public class Factorial2 {
	public static void main(String[] args) {
		
		int number = 5;
		System.out.println(number + "!" + ": Factorial of [" + number + "] = " + fact(number));
		
	}
	
	public static long fact(int num) {
		
		if(num < 0) {
			throw new IllegalArgumentException("You entered a negative number");
		}
		else {
			long factorial = 1;
		
			if(num == 0 || num == 1)
				return factorial;
			else {
				for(int i = num ; i > 0; factorial *= i, i--)
					;
		}
		
		return factorial;
		}
	}
	
}