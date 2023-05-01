
class DisplayArrays {
	
	public static void main(String[] args) {
		
		System.out.println("DISPLAYING ARRAYS");
		
		int[] integerArray = {2, 4, 6, 8, 10};
		
		// Displaying arrays in one line
		for(int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
		System.out.println();
		
		// Displaying arrays multi line
		for(int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
		System.out.println();
		
	}
}
