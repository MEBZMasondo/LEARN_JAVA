
public class JavaPrintfString {
  public static void main(String[] args) {
    
	String name = "Henry";
    String surname = "Cele";
    
	System.out.printf("NAME: %s and SURNAME: %S. %n", name, surname); // %s : case preserved, %S : converted to uppercase
	
  }
}