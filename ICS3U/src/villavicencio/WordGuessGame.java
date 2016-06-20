package villavicencio;

import java.util.Scanner;

/*gWord.java
 * this program is supposed to make the user guess about the random word stored by the computer, first by letting them guess for 3 letters.
 * Paola Villavicencio
 * May 9 2016
 */
public class WordGuessGame {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner (System.in);
		
		String gWord;
		String [] secretRandomWord={"flower","cat","dog","rose","house"};
		int x=(int)(Math.random()*secretRandomWord.length);
		
		
		
	    String dashes="";
	    
	    System.out.println("Guess the word!");
	    
	    for (int i=0;i<secretRandomWord[x].length();i++)
	    {
	    	dashes=dashes+"-";
	    }
	    System.out.println(dashes);
	    
	    do
	    {
	    	int counter=0;
	    	System.out.println("Please enter a letter(enter ! if you want to guess the word)");
	    	gWord=scn.nextLine();
	    	
	    	if (gWord.equalsIgnoreCase("!"))
	    	{
	    		System.out.println("What do you think the word is?");
	    		gWord=scn.nextLine();
	    		if (gWord.equalsIgnoreCase(secretRandomWord[x]))
	    		{
	    			System.out.println("Congrats, you're right!");
	    		}
	    		else
	    		{
	    			System.out.println("Sorry that's wrong.");
	    			System.out.println(dashes);
	    		}
	    		
	    	}
	    	else
	    	{
	    		int num = secretRandomWord[x].indexOf(gWord);
	    		
	    		if (num==-1)
	    		{
	    			System.out.println("Sorry, that letter isn't in the word. Please pick another letter");
	    			System.out.println(dashes);
	    		}
	    		else 
	    		{
	    			dashes=dashes.substring(0, num)+gWord+dashes.substring(num+1,secretRandomWord[x].length());
	    			System.out.println(dashes);
	    			for(int i=0;i<dashes.length();i++)
		    		{
		    			if (dashes.charAt(i)!='-')
		    			{
		    				counter++;
		    			}
		    			if (counter==secretRandomWord[x].length())
		    			{
		    				System.out.println("Congrats, you guessed all the letters");
		    				gWord=secretRandomWord[x];
		    			}
		    		}
	    		}
	    		
	    		
	    	}
	    	
	    	
	    }while(!gWord.equalsIgnoreCase(secretRandomWord[x]));
	    
	    
	

	}

}
