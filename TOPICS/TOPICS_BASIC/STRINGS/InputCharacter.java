import java.util.Scanner;
class InputCharacter {
	public static  void main(String[] args) {
		// Input a single character
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character :");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("The character entered is :" + ch);
	}
	
}