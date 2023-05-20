/* 
println VS printf
*/
public class JavaPrintVsPrintlnVsPrintf {
  public static void main(String[] args) {
    
	String name = "Henry";
    String surname = "Cele";
	
	/* Java String prin syntax. */
	System.out.print("NAME: " + name + " and SURNAME: " + surname + "\n"); // needs the new line escape character to go to the new line
    
	/* Java String println syntax. */
	System.out.println("NAME: " + name + " and SURNAME: " + surname); 
	
	/* Java String printf syntax. */ 
	System.out.printf("NAME: %s and SURNAME: %S. %n", name, surname); // %s : case preserved, %S : converted to uppercase
	
  }
}
