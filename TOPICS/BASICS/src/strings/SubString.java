class SubString {
	public static void main(String[] args) {
		String message = "Welcome to Java";
		//String message = message.substring(0,11) + "HTML";
	
		// PLAY AROUND WITH THE SUBSTRING MANIPULATION
		//message = message.substring(1,3);
		System.out.println(message.substring(0)); 		// Welcome to Java
		
		System.out.println(message.substring(0,1));		// W
		System.out.println(message.substring(0,2));		// We
		System.out.println(message.substring(8,10)); 	// to
		
		
		System.out.println(message.substring(8)); 		// to Java
		
		//System.out.println(message.substring(-8)); 	// Error
		//System.out.println(message.substring(10,8)); 	// Error
		
	}

}