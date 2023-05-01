
class SumArraysElements {
	
	public static void main(String[] args) {
		
		System.out.println("SUM ARRAY ELEMENTS");
		
		int[] integerArray = {2, 4, 6, 8, 10};
		
		// Summing elements		
		int sum = 0;
		for(int i = 0; i < integerArray.length; i++) {
			sum += integerArray[i];
		}
		System.out.println("SUM ELEMENTS = " + sum);	
		
	}
}