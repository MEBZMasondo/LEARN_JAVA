class replace {
   public static void main(String[] args) {
      String myString = "Hello";
      
      myString.replace("l","");
      System.out.println("PRINT :" + myString.replace("l",""));
      
      String myStringReplaced = myString.replace("l","");
      System.out.println("NEW STRING :" + myStringReplaced);

   
   
   }
}