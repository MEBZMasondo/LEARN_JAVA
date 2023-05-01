
class ArraysBasic {
	
	public static void main(String[] args) {
		
		System.out.println("ARRAYS : BASIC\n");
		
		// Array types
		int[] intArray;
		String[] strArray;
		char[] chArray;
		double[] douArray;
		boolean[] boolArray;
		// NB: Objects of arrays are also possible
		
		/*
		The rest of the example will be for an integer array
		*/
		
		// Array declaration
		int intArray1[];
		int[] intArray2;
		int[] intArray3 = null;
		
		// Array Initialising 1
		int[] intArray = new int[5];	// initialise it with the new keyword, allocates the memory for an array of immutable size 5
		/*
		Java populates arrays with default element values depending on the element type - 
		integers 	= 0  
		booleans 	= false  
		objects 	= null 
		*/
		
		// Array Initialising 2 : assign values one by one
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		
		// Array Initialising 3 :
		int intArray[] = {-2, 0, 2, 4, 6, 8, 10};	// one liner to declare and initialise
		int[] intArray = new int[]{-2, 0, 2, 4, 6, 8, 10};
		
		
		// for loop to initialise it with some values
		int[] intArr = new int[10];	

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i;
		}
		
		// Initialising with input values
		
		// Initialising with random values
			
	}
}