
public class ArrayMax {
	public static void main(String[] args) {
		
		int[] numbers = {10, -5, -20, 4, 0};
		System.out.println(maximum(numbers));
		
	}
	
	public static int maximum(int[] arr) {
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];			
		}
		return max;
	}
	
}