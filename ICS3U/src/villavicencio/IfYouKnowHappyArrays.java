package villavicencio;
/* IfYouKnowHappyArrays.java
 * Stores different verses of the song and diplaying them 3 times with a different verse in a for loop of 10 times.
 * Paola Villavicencio
 * April 22 2016
 */

import java.util.Scanner;

public class IfYouKnowHappyArrays {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	
	String [] song = {"clap your hands", "stomp your feet", "touch your nose", "touch your feet", "clap your fingers", "dance crazyly", "move your head", "touch your ears", "move your hands", "sing this song"};
		
	for (int i = 0; i <= song.length -1; i++){
		System.out.println("If you are happy and you know it " + song[i]);
		System.out.println("If you are happy and you know it " + song[i]);
		System.out.println("If you are happy and you know it and you really want to show it");
		System.out.println("If you are happy and you know it " + song[i]);
	}
	
	
	

	}

}
