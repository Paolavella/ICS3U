package villavicencio;
import java.util.Scanner;


/*
QuadFormula
Calculate the roots of any input of a, b and c of the equation ax^2 + bx + c with the use of a quadratic formula.
 
Paola Villavicencio
Computer Science Grade 11
*/

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double discrim;
		double root1;
		double root2;

		
		
		// display explaining message
		 
		System.out.println("This quadratic formula program finds the root(s) where f(x) =0 for the function f(x) = ax^2 + bx +c");
		 
		// Asks user for values
		System.out.println("Enter values for a, b and c");
		System.out.print("a:");
		a =  sc.nextDouble();
		 
		System.out.print("b:");
		b =  sc.nextDouble();
		 
		System.out.print("c:");
		c =  sc.nextDouble();
		 
		// calculate the discriminant, b^2 -4ac
		discrim= Math.pow(b, 2)- 4*a*c;
		
		
					
		if (discrim > 0)  // two real roots
		{
		
		root1 =(-b + Math.sqrt(discrim))/(2*a);
		root2 =(-b - Math.sqrt(discrim))/(2*a);
		root1 = Math.round(root1 *10)/10;
		root2 = Math.round(root2 *10)/10;
		
		System.out.println("Two real roots: "+ root1 + " and " + root2);// displaying answer
		 
		 
		}
		else if (discrim < 0) // 2 imaginary numbers
		{
		System.out.println("Can't calculate due to these are imaginary roots");
		}
		
		else 
		{
		root1 =(-b + Math.sqrt(discrim))/(2*a);
		root1 = Math.round(root1 *10)/10;
		System.out.println("One real root: "+ root1);
		}
		}
		
		
	
		 
		 
	

	

}
