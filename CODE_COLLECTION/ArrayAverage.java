
public class ArrayAverage {
	public static void main(String[] args) {
		
		double[] numbers = {10, -5, -20, 4, 0};
		System.out.println(average(numbers));
		
	}
	
	public static double average(double[] arr) {
		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];	
		
		return sum/arr.length;
	}
	
}