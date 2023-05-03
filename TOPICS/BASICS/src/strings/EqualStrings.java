// do not use '==' for strings

class EqualStrings {
	
	public static void main(String[] args) {
		
		// FLAVOUR 1
		String s1 = "hello";
		String s2 = "Hello";
		
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are NOT equal");
			
		// FLAVOUR 2
		String s01 = "hello";
		String s02 = "Hello";
		
		if(s01.equalsIgnoreCase(s02))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are NOT equal");
	}
}