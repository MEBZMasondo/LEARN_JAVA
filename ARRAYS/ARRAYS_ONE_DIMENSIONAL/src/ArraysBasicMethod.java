
class ArraysBasicMethod {
	
	public static void main(String[] args) {
		
		System.out.println();
		
		
	}
	
	/* METHODS RETURNING ARRAYS 1 */
	// This method will work
	public static int[] createArray() {
		return new int[]{2, 4, 6}; 
	}

	// This method will NOT work
	public static int[] createArray() {
		return {2, 4, 6};
	}
	
}




