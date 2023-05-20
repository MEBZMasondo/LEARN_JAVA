class ArrayEg2 {
	public static void main ( String[] args ) {
		double[] val = new double[4]; // an array of double with cells/emements automatically initialized to 0.0
		
		val[0] = 0.17;
		val[1] = 1.78;
		val[2] = 4.67;
		
		int j = 3;
		System.out.println( "cell 3: " + val[ j ] );
		System.out.println( "cell 2: " + val[ j - 1 ] );
		
		j = j - 2;
		System.out.println( "cell 1: " + val[ j ] );
		
	}
}