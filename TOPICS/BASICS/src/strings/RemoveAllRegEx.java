//https://atechdaily.com
class RemoveAllRegEx {
   public static void main(String[] args) {
      String myString = "This &% is a @ sentence";
      myString = myString.replaceAll("[^a-zA-Z0-9]","");
      
      System.out.println(myString); 
      
      
   
   }


}