
public class ArrayAbsoluteMax {
	public static void main(String[] args) {
		
		int[] numbers = {10, -5, -20, 4, 0};
		System.out.println(absMax(numbers));
		
	}
	
	public static int absMax(int[] arr) {
		
		int max = Math.abs(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(Math.abs(arr[i]) > Math.abs(max))
				max = arr[i];			
		}
		return max;
	}
	
}