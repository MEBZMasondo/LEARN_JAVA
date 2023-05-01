import java.util.stream.IntStream;

class ArraysIntermediate {
	
	public static void main(String[] args) {
		
		
		// IntStream.range()
		/* 
		IntStream Java interface: for integer array 
		THE CLASSES:
			IntStream
			DoubleStream 
			LongStream
		*/
		System.out.println("INTSTREAM.RANGE");
		int[] intArray1 = IntStream.range(1, 6).toArray(); // from 1 to 5 , (1, n) will be from 1 to (n - 1)
		
		for(int i = 0; i < intArray1.length; i++) {
			System.out.print(intArray1[i] + " ");
		}
		System.out.println();
		
		// IntStream.rangeClosed()
		/*
		include the last element 
		*/
		System.out.println("INTSTREAM.RANGECLOSED");
		int[] intArray2 = IntStream.rangeClosed(1, 6).toArray(); // from 1 to 6 , (1, n) will be from 1 to n
		
		for(int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i] + " ");
		}
		System.out.println();
		
		// IntStream.of()
		/*
		similarly to declaring an array with elements: 
		e.g int[] intArray = new int[]{-2, 0, 2, 4, 6, 8, 10};
		*/
		System.out.println("INTSTREAM.OF");
		int[] intArray3 = IntStream.of(15, 12, 9, 6, 3).toArray();
		
		for(int i = 0; i < intArray3.length; i++) {
			System.out.print(intArray3[i] + " ");
		}
		System.out.println();
		
		// Sorted
		int[] intArray4 = IntStream.of(15, 12, 9, 6, 3).sorted().toArray();
	}
		
}