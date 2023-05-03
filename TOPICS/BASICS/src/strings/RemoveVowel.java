class RemoveVowel {
	public static void main(String[] args) {
		// METHOD 1
		String s1 = "Hello, how are you ?";
		
		String ns1 = "";
		for(int i = 0; i < s1.length() ; i++) {
			if(s1.charAt(i) != 'a' && s1.charAt(i) != 'e' && s1.charAt(i) != 'i'
				&& s1.charAt(i) != 'o' && s1.charAt(i) != 'u') {
				ns1 += s1.charAt(i);
			}
		}
		System.out.println(ns1);
		
		
		// METHOD 2 - NOT WORKING YET
		String s = "Hello, how are you";
		String vowels = "aeiou";
		String ns = "";
		
		for(int i = 0; i < s.length() ; i++) {
			for(int j = 0; j < vowels.length() ; j++) {
				if(s.charAt(i) != vowels.charAt(j))
					ns += s.charAt(i);
			}
		}
		System.out.println(ns);
	}

}