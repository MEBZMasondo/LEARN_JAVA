class RemoveVowels {
   public static void main(String[] args) {
      String myString = "1423QAEIOUwougfaHelilou"; // 1423QwgfHll
      String myNewString = "";
      // Loop trough a string
      for(int i = 0; i < myString.length(); i++) {
         System.out.println(myString.charAt(i));
      }
      
      // Loop trough a string and compare to a single vowel
      /*
      for(int i = 0; i < myString.length(); i++) {
         if(myString.charAt(i) != 'a') {
            myNewString += myString.charAt(i);
         }
         
         //System.out.println(myString.charAt(i));
      }
      System.out.println("RESULT STRING 1 : " + myNewString);
      */
      
      // Loop trough a string and compare to vowels
      for(int i = 0; i < myString.length(); i++) {
         if(myString.charAt(i) != 'a' && myString.charAt(i) != 'e' && myString.charAt(i) != 'i' 
         && myString.charAt(i) != 'o' && myString.charAt(i) != 'u' &&
         myString.charAt(i) != 'A' && myString.charAt(i) != 'E' && myString.charAt(i) != 'I' 
         && myString.charAt(i) != 'O' && myString.charAt(i) != 'U') {
            myNewString += myString.charAt(i);
         }
      }
      
      System.out.println("RESULT STRING 2: " + myNewString);
      
      
      
      
   }
}