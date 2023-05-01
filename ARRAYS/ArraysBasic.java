
class ArraysBasic {
	public static void main(String[] args) {
		
		System.out.println("ARRAYS : BASIC\n");
		
		// Array declaration
		int[] intArray1; // or int[] intArray2 = null;
		String[] strArray1;
		char[] chArray1;
		double[] douArray1;
		boolean[] boolArray1;
		
		// Array creation
		
		// Initialising
		
		// Initialising with input values
		
		// Initialising with random values
		
		// Displaying arrays
		int[] integerArray = {2, 4, 6, 8, 10};
		
		System.out.println("DISPLAYING ARRAYS");
		for(int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
		System.out.println();
		
		// Summing elements
		System.out.println("SUMMING ARRAY ELEMENTS");
		int sum = 0;
		for(int i = 0; i < integerArray.length; i++) {
			sum += integerArray[i];
		}
		System.out.println("SUM ELEMENTS = " + sum);
		
		
		
	}
}