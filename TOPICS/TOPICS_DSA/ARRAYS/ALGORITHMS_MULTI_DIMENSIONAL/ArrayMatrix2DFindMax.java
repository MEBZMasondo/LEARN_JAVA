// The method only returns an it 
// code modified to find the location outside of the method required
class ArrayMatrix2DFindMax {
	public static void main(String[] args) {
   
	int[][] A = {{210, 5, 7},{50, 10, 80},{56, 9, 200}};
	
	int x = locateLargest(A);
    
	// find location of the value
    for(int row = 0; row < A.length ; row++) {
		for(int col = 0; col < A[row].length ; col++) {
			if(A[row][col] == x) {
				System.out.println("Position " + "["+ row +"]" + "[" + col +"]");
			}
		}   
	}     
}

	// Method to find the largest int in an array
	public static int locateLargest( int[][] A) {
		int max = A[0][0];
		int [] coord = new int [2];
      
		for(int row = 0; row < A.length ; row++) {
			for(int col = 0; col < A[row].length ; col++) {
				if(A[row][col] > max) {
					max = A[row][col];
				}
			}
		}
		return max;
	}

}