import java.util.Scanner;
class InputStringLine {
	public static  void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String Line (sentence) :");
		String s = input.nextLine();
		
		System.out.println("Message : " + s);
	}
	
}