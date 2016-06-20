package villavicencio;
/**IsItPrime.java
 *Program that gets a number from the user and checks if it is prime. Using isItDivisible method from class.
Paola Villavicencio
May 30, 2016**/
import java.util.Scanner;

public class IsItPrime {
	public static int num;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// getting number from user
		System.out.println("Let's find out if the number is prime. Enter a number:");
		int num = scn.nextInt();
		
		
		if (primeNum(num))
		{
			System.out.println("The number: " + num +" is prime.");
		}
		else
		{
			System.out.println("The number: " + num +" is not prime.");
		}
	}

	public static boolean primeNum(int num) {
		if(num==0||num==1)
		{
			return(false);
		}
		//checking if the number inputed is prime
		for(int g=2;g<num;g++)
		{
			if(isItDivisible(num, g))
			{
				return (false);
			}
		}
		return(true);
	
	}

	public static boolean isItDivisible(int num, int g) {
		
		//dividing inside primeNum method
		if(num%g!=0)
		{
			return (false);
		}
	
		return(true);
	}

	
	
	
}
