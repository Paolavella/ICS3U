package villavicencio;
/** 
 *FunMath2.java
 *This program program that gets two numbers from the user and then adds, subtracts, multiplies and divides them. Also there is a method for each operator that takes the two values as parameters, calculates and prints the result on the screen.
 * @version May 24 2016
 *@author Paola Villavicencio
 */

import java.util.Scanner;


public class FunMath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		// getting integers from the user
		System.out.println("Enter first number"); 
		int x = Integer.parseInt(scn.nextLine());// variable first number
		
		System.out.println("Enter second number"); 
		int y = Integer.parseInt(scn.nextLine());// variable second number
		
		
		//After all methods displaying each answer for user
		int nAdd = numAdd(x,y);// variable for answer from method
		System.out.println("sum =" + nAdd);// display it
		
		int nMul = numMulti(x,y);
		System.out.println("multiplication =" + nMul);
		
		int nS = numSub(x,y);
		System.out.println("subtraction =" + nS);
		
		int nD = numDividing(x,y);
		System.out.println("division =" + nD);
	
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static int numDividing(int x, int y)// variables being use from maid method
	{
	int divide = x/y;
	return(divide); // returning to maid method
	}
	
	//subtracting method
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static int numSub(int x, int y){
		int subs = x-y;
		return(subs);
		}
	
	//Adding method
	public static int numAdd(int x, int y){
		int add = x+y;
		return(add);
		}
	
	//Multiplying Method
	public static int numMulti(int x, int y){
		int mul = x*y;
		return(mul);
		}
		
	
	
	
	
	
	
}
