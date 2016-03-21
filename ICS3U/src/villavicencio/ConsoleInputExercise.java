package villavicencio;
/* InputExercise.java
 * this program prints age the mother fgave birth and name of child
 * Paola Villavicencio
 * Mar 8 2016
 */
import java.util.*;
public class ConsoleInputExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput =new Scanner(System.in);
		int childAge;
		int mothersAge;
	    String childName;
		String mothersName;
		int age;
		
		
        System.out.println("What is your name?");
		
		mothersName = myInput.nextLine(); // getting Mother name
		
        System.out.println("What is your child's name?");
		
		childName = myInput.nextLine();// getting Child name
		
		
		System.out.println("How old are you?");
		
		mothersAge = Integer.parseInt(myInput.nextLine()); // getting actual mother's age
		
		
        System.out.println("How old is your child?");
		
		childAge = Integer.parseInt(myInput.nextLine()); // getting actual child's age
		
		
		
		age = mothersAge - childAge; // Processing the mother subtracting the child's age to get the age when she gave birth
		
		System.out.println("You" + mothersName + "were" + age + "when your child" + childName + "was born." );
		
	}

}
