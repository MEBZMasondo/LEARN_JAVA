class ArrayMultiplyMatrices {
	public static void main(String[] args) {
		
		int[][] A = {{1,3,1},{1,0,0},{1,2,2}};
        int[][] B = {{0,0,5},{7,5,0},{2,1,1}};
        
		// Solution;
		int[][] C = new int[A.length][B[0].length];
        
		int sOP = 0;
        
		for(int mainRow = 0; mainRow < A.length ; mainRow++) {
			for(int row = 0; row < A[0].length ; row++) {
				for(int col = 0; col < B.length ; col++) {
					sOP += A[row][col] * B[col][row]; 
				} 
			C[mainRow][row] = sOP; // 0, 0 //  
			sOP = 0;
               
			} 
		}
        
		// Print Out C
		for(int row = 0; row < C.length; row++) {
			for(int col = 0; col < C[0].length; col++) {
				System.out.print("[" + C[row][col] + "] ");
		}
		System.out.println();
		}
        
	}
}