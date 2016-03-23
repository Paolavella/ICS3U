package villavicencio;
import java.util.*;
/* RandomNameLike.java 
 * Ask for the name of the user and randomly outputs either if they 
 * Paola Villavicencio
 * March 23, 2016
 */

public class RandomNameLike {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//variables
		String name;
		int num;
		
		//Get users name		
		System.out.println("Tell me your awesome real name: ");
		name = sc.nextLine();
		
		//getting a random number if its 0 to 7 it will like it and it won't if its not
		num = (int) (Math.random()*10);
		
		
		// either output if it likes it or not
	 if (num >=0 && num <=7)
		 System.out.println("I love your name " + name + ". Indeed wonderful!");
	 else
		 System.out.println("I do not like your name" + name + ". Sorry I hate it.");
	 
	 
	 
	}

}
