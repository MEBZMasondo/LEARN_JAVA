
public class ArrayMin {
	public static void main(String[] args) {
		
		int[] numbers = {10, -5, -20, 4, 0};
		System.out.println(minimum(numbers));
		
	}
	
	public static int minimum(int[] arr) {
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];			
		}
		return min;
	}
	
}