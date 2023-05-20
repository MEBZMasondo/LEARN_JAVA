class RemovePunctAndSpace {
   public static void main(String[] args) {
      String myString = "       Hello @ % there & *";
      
      String trimmedString = myString.strip();
      
      
      System.out.println("String Trimmed : " + trimmedString);
   }

}