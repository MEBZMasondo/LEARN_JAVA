
class MyArrays {
	public static void main(String[] args) {
		
		int[] ints = {1, 2, 10, -5, 3, 4};

		// print the array
		toString(ints);
		System.out.println("Sum of ints : " + sum(ints));
		System.out.println("min of ints : " + min(ints));

	}

	// METHODS
	// Printout the arrays
	public static void toString(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ]");
	}

	// sum 
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// min 
	public static int min(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
}