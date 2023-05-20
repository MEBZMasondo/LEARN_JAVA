// Program to count number of vowels in a String
class HowManyChars {
	public static void main(String[] args) {
		
		String vowels = "aeiou";
		String myString = "This Is A Good Sentence To Test With";
		char myChar = 'v';
		
		System.out.println("Origional String 	:" + myString);	
		myString = myString.toLowerCase(); 
		System.out.println("New string in lowerCase :" + myString);
		
		for(int i = 0; i < vowels.length() ; i++) {
			System.out.println("[ " + vowels.charAt(i) + "] appears " + howMany(myString, vowels.charAt(i)) + " times");
		}	
	}
	
	// Method to return a count of a single character in a string
	public static int howMany(String s, char c ) {
		int count = 0;
		for(int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}