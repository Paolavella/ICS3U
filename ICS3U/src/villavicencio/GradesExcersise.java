package villavicencio;
/* GradesExcersise.java
 * this program gets the user's number of marks and the marks to be converted to letters and then outputs them.
 * Paola Villavicencio
 * Mar 30 2016
 */
import java.util.*;

public class GradesExcersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
	
	//variables 
	int T;
	int g;
	String grade;
	
	System.out.println("How many marks are you inputing");
	g =  Integer.parseInt(sc.nextLine());
	
	
	
	
	
	for (int i = 1 ; i <= g; i++)
	{
		System.out.println("input mark");
		T =  Integer.parseInt(sc.nextLine());
		
		if (T<= 100 && T>=80){
			grade = "A";
		}
	    
		else if (T>= 70 && T<=79){
			grade = "B";
		}
		
		else if (T>= 60 && T<= 69){
			grade = "C";
		}
		
		else if (T>= 50 && T<= 59){
			grade = "D";
	
		}
		else if (T>= 0 && T<= 49){
			grade = "F";;

     	}
		
		else {
			grade = "X";
		}
		System.out.println("The mark " + T + " equal the grade is " + grade + " !");
      	}
	    
    	
	
	
	}

}
