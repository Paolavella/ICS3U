package villavicencio;

import java.util.Scanner;
/* GuessArray.java
public class GuessArray 
Meant to choose a random colour to guess the colour of the user
Paola Villavicencio
Apr 24 2016
*/{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);		
	
        String yesNo;
        boolean colour = false;
		
		
		
		String [] guess = {"blue", "green", "teal", "yellow", "orange", "brown", "red", "charcoal", "pink", "violet", "aqua", "avocado", "gold", "celeste", "cintron", "grey", "silver", "copper", "cyan", "tangerine"};
		
		
		System.out.println("Choose an colour, I will guess which colour you are thing king of! READY?! Click enter.");
	    int answer = scn.nextInt();
	    
	    while (colour == false){
		
	    	int i =0;
	    	int num = (int)(Math.random()* 20);
	    	System.out.println("Are you thinking on " + guess[i] + "?");
	    	yesNo = scn.nextLine();
	    	
		if (yesNo.equals("y")){
		System.out.println("I win!");
			
		colour = true;	
		}
		
		else if (yesNo.equals("n")){
		colour = false;
		
		}
		
	    }
		
		

		
		

	}

}
