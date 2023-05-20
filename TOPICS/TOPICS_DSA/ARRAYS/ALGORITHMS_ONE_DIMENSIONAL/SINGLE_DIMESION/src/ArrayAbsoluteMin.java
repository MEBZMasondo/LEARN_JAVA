
public class ArrayAbsoluteMin {
	public static void main(String[] args) {
		
		int[] numbers = {10, -5, -20, 4, 0};
		System.out.println(absMin(numbers));
		
	}
	
	public static int absMin(int[] arr) {
		
		int min = Math.abs(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(Math.abs(arr[i]) < Math.abs(min))
				min = arr[i];			
		}
		return min;
	}
	
}