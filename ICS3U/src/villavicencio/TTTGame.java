package villavicencio;
import java.util.Scanner;
/*TTGame.java
 * Program requires 2 players both trying to in put the coordinates first the row then the colunm, then the tictac toe moved is diplayed until someone wins.
 * May 16 2016
 * Paola Villavicencio
 * */
public class TTTGame {

	public static void main(String[] args) {

		// declaring/initializing variables
		String[][] tttBoard = new String[3][3];
		boolean[][] checker = new boolean[3][3];
		boolean iconX = false;
		boolean icon0 = false;
		tttBoard[0][0] = "";
		tttBoard[0][1] = "";
		tttBoard[0][2] = "";
		tttBoard[1][0] = "";
		tttBoard[1][1] = "";
		tttBoard[1][2] = "";
		tttBoard[2][0] = "";
		tttBoard[2][1] = "";
		tttBoard[2][2] = "";
		boolean congratsWinner = false;
		int rowNumber;
		int columnNumber;
		boolean playingAgain = true;
		String answerYesNo;

		Scanner scn = new Scanner(System.in);

		while (playingAgain) {
			while (!congratsWinner) {
				// X's turn
				if (!icon0) {
					System.out.println("Player one... what are the coordinates: Chose a row number from 1 to 3");
					rowNumber = scn.nextInt();
					System.out.println("Player one: Chose a column number from 1 to 3");
					columnNumber = scn.nextInt();
					if (!checker[rowNumber - 1][columnNumber - 1]) {
						checker[rowNumber - 1][columnNumber - 1] = true;
						// 2d board
						tttBoard[rowNumber - 1][columnNumber - 1] = "X";

						// display board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// several ways to find and look for congratsWinnerner
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " congrats Winner!");
							congratsWinner = true;
						} else {
							congratsWinner = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("") && !congratsWinner) {
							congratsWinner = true;
							System.out.println("Cat's game!");
						}
						iconX = false;
					} else {
						System.out.println("UPS YOU CAN NOT DO THAT! Coordinates were already taken, TRY AGAIN.");
						iconX = true;
					}
				}

				// O's turn
				if (!congratsWinner && !iconX) { // checks if x has already won
					System.out.println("Player two: chose a row number between 1 to 3 ");
                    rowNumber = scn.nextInt();
                    System.out.println("Player two now: chose a column number between 1 to 3 ");
					columnNumber = scn.nextInt();

					if (!checker[rowNumber - 1][columnNumber - 1]) {
						checker[rowNumber - 1][columnNumber - 1] = true;
						// plant o
						tttBoard[rowNumber - 1][columnNumber - 1] = "O";

						// show board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// check for congratsWinner
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " congrats Winner!");
							congratsWinner = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " congrats Winner!");
							congratsWinner = true;
						} else {
							congratsWinner = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
							congratsWinner = true;
							System.out.println("Cat's game!");
						}
						icon0 = false;
					} else {
						System.out.println("UPS YOU CAN NOT DO THAT! Coordinates were already taken, TRY AGAIN.");
						icon0 = true;
					}
				}
			}
			// play again?
			System.out.println("Would you like to play again?(Yes/No)");
			scn.nextLine();
			answerYesNo = scn.nextLine();
			if (answerYesNo.equalsIgnoreCase("No")) {
				System.out.println(":(");
				playingAgain = false;
			} else {
				// reset everything
				playingAgain = true;
				tttBoard[0][0] = "";
				tttBoard[0][1] = "";
				tttBoard[0][2] = "";
				tttBoard[1][0] = "";
				tttBoard[1][1] = "";
				tttBoard[1][2] = "";
				tttBoard[2][0] = "";
				tttBoard[2][1] = "";
				tttBoard[2][2] = "";

				checker[0][0] = false;
				checker[0][1] = false;
				checker[0][2] = false;
				checker[1][0] = false;
				checker[1][1] = false;
				checker[1][2] = false;
				checker[2][0] = false;
				checker[2][1] = false;
				checker[2][2] = false;

				congratsWinner = false;
				iconX = false;
				icon0 = false;
			}

		}
	}
}