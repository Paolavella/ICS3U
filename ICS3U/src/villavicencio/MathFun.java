package villavicencio;
/**MathFun.java
 *This program program that gets two numbers from the user and then adds, subtracts, multiplies and divides them. Also there is a method for each operator that takes the two values as parameters, calculates and prints the result on the screen.
 *@version May 24 2016
 *@author Paola Villavicencio
 **/
import java.util.Scanner;

public class MathFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scn = new Scanner(System.in);
	
	
	// getting integers from the user
	System.out.println("Enter first number"); 
	int num1 = Integer.parseInt(scn.nextLine());// variable first number
	
	System.out.println("Enter second number"); 
	int num2 = Integer.parseInt(scn.nextLine());// variable second number
	
	numDividing(num1,num2);
	numSub(num1,num2);
	numAdd(num1,num2);
	numMulti(num1,num2);
	
	
	
	}


public static void numDividing(int x, int y)// variables being use from maid method
{
int divide = x/y;
System.out.println("division =" + divide);
}



public static void numSub(int x, int y){
	int subs = x-y;
	System.out.println("subtraction =" + subs);
	}


public static void numAdd(int x, int y){
	int add = x+y;
	System.out.println("sum =" + add);
	}

/**Multiplying Method
 * @param x got from user
 * @param ygot from user
 * @return
 */
public static void numMulti(int x, int y){
	int mul = x*y;
	System.out.println("multiplication =" + mul);
	}
	



}
