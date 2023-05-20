import java.util.Arrays;

public class ReturnArrayExample1  {  
	public static void main(String args[]) {  
	
		int[] a = numbers();           //obtain the array  
		for (int i = 0; i < a.length; i++) //for loop to print the array  
			System.out.print( a[i]+ " ");     
}  
    
	// METHODS    
	public static int[] numbers()  {  
		int[] arr={2, 4, 6, 8};  //initializing array  
		return arr;  
	} 
	
}  