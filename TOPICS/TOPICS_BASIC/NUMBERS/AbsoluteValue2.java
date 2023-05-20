
public class AbsoluteValue2 {
	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println(abs(num1));
		
		int num2 = -7;
		System.out.println(abs(num2));
		
		int num3 = 0;
		System.out.println(abs(num3));
	}
	
	public static int abs(int num) {
		return num < 0 ? -num : num;
	}
}

