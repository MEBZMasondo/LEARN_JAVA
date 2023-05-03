import java.util.*;

class AddTwoMatrix {

    public static void main(String args[]) {
        
        // Run 1
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{2, 4}, {6, 8}};

        int[][] res = addMatrices(A, B);
		
		System.out.println("MATRIX A");
		displayArray(A);
		
		System.out.println("MATRIX B");
		displayArray(B);
		
		System.out.println("RESULT A + B");
        displayArray(res);

        // Run 2
        //Scanner sc = new Scanner(System.in);
    }

    // METHODS
    public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
        /* Throw error if row and col of arrays not equal
         * Use javadoc style
         */
        int[][] sum;
        sum = new int[arr1.length][arr1[0].length];

        for(int row = 0; row < arr1.length; row++) {
            for(int col = 0; col < arr1[row].length; col++) {
                sum[row][col] = arr1[row][col] + arr2[row][col];
            }

        }
        return sum;
    }

    public static void displayArray(int[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }
}