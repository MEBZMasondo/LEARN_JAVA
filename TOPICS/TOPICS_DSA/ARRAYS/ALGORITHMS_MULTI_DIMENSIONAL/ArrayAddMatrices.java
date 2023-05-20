class ArrayAddMatrices {
    public static void main(String[] args) {
      
        int[][] A = {{1,3,1},{1,0,0},{1,2,2}};
        int[][] B = {{0,0,5},{7,5,0},{2,1,1}};
        
        // create array C (called arraySum) of size A
        int rows = A.length;      // size of the rows
        int columns = A[0].length;    // size from column = row 0 length 
        int[][] arraySum = new int[rows][columns];
        
        // sum A and B into C
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < columns ; col++) {
                arraySum[row][col] = A[row][col] + B[row][col];
            }
        }
        
        // Print out the sum of arrays
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < columns ; col++) {
                System.out.print("[" + arraySum[row][col] + "] ");
            }
            System.out.println();
        }
    }
    
}