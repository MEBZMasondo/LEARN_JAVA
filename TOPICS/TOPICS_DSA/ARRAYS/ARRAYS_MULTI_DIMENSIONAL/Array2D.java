
class Array2D {
	public static void main(String[] args) {
		
		int[][] numbers = { {1 , 6, 6, 7, 9, 7, 3},
							{9, 7, 1, 6, 5, 8, 9},
							{0, 7, 4, 6, 4, 9, 3}
						  }; 
								  
		// Length of the 2D array => number of rows
		System.out.println(numbers.length + ": rows");						  
		System.out.println(numbers[0].length + " elements in row 0");
		System.out.println(numbers[1].length + " elements in row 1");
		System.out.println(numbers[2].length + " elements in row 2");
			
		// Read All data 
		for(int i = 0; i < numbers.length ; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print("[" + numbers[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
