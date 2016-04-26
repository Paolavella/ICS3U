package villavicencio;
/* CallingAMethod.java
 * THIS PROGRAM SHOULD BE CALLED ArraysNames due to confusion it got mix up. This program collects the number of names and the names that the user is inputing.THIS PROGRAM SHOULD BE CALLED ArraysNames due to confusion it got mix up. This program collects the number of names and the names that the user is inputing.
 * Paola Villavicencio
 * April 22 2016
 */
import java.util.Scanner;

public class CallingAMethod {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
		
		
		
	System.out.println("How many names are you inputing");
	int n = Integer.parseInt(scan.nextLine());
	
	String [] names = new String [n];
	
	System.out.println("Enter name: ");
	for(int i = 0; i < n; i++){
		names [i] = scan.nextLine();
	
	}
	
	System.out.println("Here are the names in order: ");
	for(int i = 0; i < n; i++){
		System.out.println(names[i]);
		
	
	}
	
	System.out.println("Here are the names in reverse order: ");	
	for (int i = n-1; i >= 0; i--){
		System.out.println(names[i]);
		
	}
	
	

	}

}
