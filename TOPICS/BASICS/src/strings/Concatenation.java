class Concatenation {
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Programmer";
		
		// METHOD 1
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		
		// METHOD 2
		String s03 = s1.concat(" " + s2); // or add a space on s2 before 'P'
		System.out.println(s03);
	}

}