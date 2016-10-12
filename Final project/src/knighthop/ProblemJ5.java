
package knighthop;
import java.util.Scanner;
public class ProblemJ5 {
	/*Knighthop.jave program will read the starting location of the knight and and output the smallest number of jumps or moves needed to arrive at a location specified by the second input
	 * September 21,2016.
	 * Paola Villavicencio*/
	static int m;
	static int fsize = 8; // board size (8*8)
	static int board[][] = new int[fsize][fsize];
	static int[] move_x = {1, 2, 2, 1, -1, -2, -2, -1}; // possible moves (x-axis)
	static int[] move_y = {-2, -1, 1, 2, 2, 1, -1, -2}; // possible moves (y-axis)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = Integer.parseInt(scn.nextLine());
		int b = Integer.parseInt(scn.nextLine());//Coordinates where it starts from
		int x = Integer.parseInt(scn.nextLine());
		int y = Integer.parseInt(scn.nextLine());//Coordinates to end up in 
		for (int i = 0; i < fsize; i++) {
			for (int c = 0; c < fsize; c++) {
				board[i][c] = -1;
			}
		}

		Solve(0, 0, 0);
		knightmove(x,y,a,b);

	}

	private static void knightmove(int x, int y, int a, int b) {}

	static void Solve(int move_number, int x, int y) {
		board[x][y] = move_number;

		// check whether the knight has been on all possible moves or not
		if (move_number == ((fsize * fsize) - 1)) {
			for (int i = 0; i < fsize; i++) {
				for (int c = 0; c < fsize; c++) {
					System.out.printf("%3d", board[i][c]);
				}
				System.out.println("\n");
			}
		} 
		else {
			// calculate new board coordinates
			for (int i = 0; i < 8; i++) {
				for (int c = 0; c < 8; c++) {
					// Check whether the new coordinates are valid or not
					if ((x + move_x[i]) >= 0 && (x + move_x[i]) < fsize && (y + move_y[c]) >= 0 && (y + move_y[c]) < fsize) {
						// check whether the knight has been on this field or not (-1 = hasn't been here)
						if (board[x + move_x[i]][y + move_y[c]] == -1) {
							System.out.println("Move: " + move_number + "\n");
							// Find next field
							Solve(move_number + 1, (x + move_x[i]), (y + move_y[c]));
						}
					}
				}
			}
			// couldn't find a valid move
			board[x][y] = -1;
		}
	}






	private static void knightmove2(int a, int b) {
		if (a==0&&b==0){
			System.out.print(m);
		}

	}
}



