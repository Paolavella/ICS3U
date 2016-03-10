package villavicencio;
/* Arimethic.java*/
import java.util.Scanner;

/* Arimethic.java
 * this program stores five numbers
 * Paola Villavicencio
 * Mar 10 2016
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput =new Scanner(System.in);
		int numb1;
		int numb2;
		int numb3;
		int numb4;
		int numb5;
		int ans1;
		int ans2;
		int ans3;
		int ans4;
		int ans5;
		double ans6;
		double ans7;
		
        System.out.println("INPUT FIRST NUMBER");
		
		numb1 = Integer.parseInt(myInput.nextLine());
		
		 System.out.println("INPUT SECOND NUMBER");
			
		numb2 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("INPUT THIRD NUMBER");
			
		numb3 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("INPUT FORTH NUMBER");
		
		numb4 = Integer.parseInt(myInput.nextLine());
		
		System.out.println("INPUT FIFTH NUMBER");
		
		numb5 = Integer.parseInt(myInput.nextLine());
		
		ans1 = numb1 + numb2 + numb3 + numb4 + numb5;
		ans2 =numb3 - numb2;
		ans3 =numb1 * numb5;
		ans4 =numb4/numb2;
	    ans5 =numb4 % numb2;
	    ans6 = Math.pow(numb1,numb3);
		ans7 = Math.sqrt(numb5);
		
		
		System.out.println("This program did the follow calculations the sum of all five numbers is " + ans1 + ", the result after subtracting the second number from the third is " + ans2 + ", the product of the first and fifth numbers is " + ans3 + ", the quotient of the fourth number divided by the second is " + ans4 + ", the remainder when dividing the fourth number by the second is " + ans5 + ", the first number raised to the power of the third number is " + ans6 + " and the square root of the fifth number is " + ans7 + ". Finito!");
		
	}

}
