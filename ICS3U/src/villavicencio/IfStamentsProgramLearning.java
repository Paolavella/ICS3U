package villavicencio;

import java.util.*;
/* IfStatements.java
 * this program prints Hello World to the console
 * Paola Villavicencio
 * Mar 3 2016
 */

public class IfStamentsProgramLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//variables
		
		double number;
		double remainder;
		double result;
		
		
		// getting the integer 
		System.out.println("Enter an integer: ");
		number = sc.nextDouble();
		
		
		//comparing if either the integer positive or negative
		if (number >= 0){
			
			System.out.println("The integer is possitive");
		}
		
		else {
			System.out.println("The integer is negative");
		}
		
		
		//calculations
		remainder = number%7;
		result = Math.round(number/7 * 10)/10; 
		
		
		//If integer is divisible by 7 
		if (remainder == 0){
			System.out.println("Indeed the number: " + number + " it is divisible by 7 and the result is: " + result);
		}
		
		else {
			System.out.println("Indeed the number: " + number + " it is not divisible by 7 and the result is: " + result);
			
			
		}

	}

}
