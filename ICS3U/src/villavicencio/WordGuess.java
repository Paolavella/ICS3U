package villavicencio;

import java.util.Scanner;

/*WordGuess.java
 * this program is supposed to make the user guess about the random word stored by the computer, first by letting them guess for 3 letters.
 * Paola Villavicencio
 * May 9 2016
 */
public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scn =new Scanner(System.in);
	String words []	= {"Apendi", "Cat", "Colour"};
	boolean guess = true;
	
	
	while (guess==true){
	
	int word = (int)(Math.random() * words.length - 1);	
	
	
	System.out.println("Guess the word I am thinking");
	String guessWord = words[word];
	
	System.out.println("guess any letter of my word");
	String letter = scn.nextLine();
	
	guessWord.indexOf(letter);
	
	if (guessWord.equals(-1)){
		
		System.out.println("My word doesn't contain this letter");
		System.out.println("try again");
		guess = true;
			}
	else {
		System.out.println("CORRECT ! NOW TRY TO GUESS THE WORD"); 
	}
			
	}			
	
	
	
	}

}
