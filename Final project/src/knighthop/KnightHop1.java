package knighthop;

import java.util.Scanner;

public class KnightHop1 {
static int m= 0;
static int fsize = 8; // board size (8*8)
static int board[][] = new int[fsize][fsize];
		static int a;
		static int b;
		public static void knightMove(int x,int y, int a, int b){
		if(x==0|| y ==0|| a==0|| b==0){
		System.out.println("Not valid move. Please enter valid one next time");}
		else if (x==a && y==b ){
		System.out.println("There is:"+m+"moves");
		}
		else{
		oneUp2right(x,y);
		
		oneUp2left(x,y);
		
		twoDown1right(x,y);
		
		twoDown1left(x,y);
		
		twoUp1right(x,y);
		
		twoUp1left(x,y);
		
		twoLeft1down(x,y);
		
		twoRight1down(x,y);
		
		}
		}
		private static void twoLeft1down(int x, int y) {
			for (int x1 = 0; x1 < fsize; x1=-2) {
	            for (int y1 = 0; y1 < fsize; y1=-1) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void twoRight1down(int x, int y) {
			for (int x1 = 0; x1 < fsize; x1=+2) {
	            for (int y1 = 0; y1 < fsize; y1=-1) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void twoUp1left(int x, int y) {
			for (int x1 = 0; x1 < fsize; x1=-1) {
	            for (int y1 = 0; y1 < fsize; y1=+2) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void twoUp1right(int x, int y) {
		
			for (int x1 = 0; x1 < fsize; x1=+1) {
	            for (int y1 = 0; y1 < fsize; y1=+2) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void twoDown1left(int x, int y) {
		
			for (int x1 = 0; x1 < fsize; x1=-1) {
	            for (int y1 = 0; y1 < fsize; y1=-2) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void twoDown1right(int x, int y) {
		
			for (int x1 = 0; x1 < fsize; x1++) {
	            for (int y1 = 0; y1 < fsize; y1=-2) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void oneUp2left(int x, int y) {
		
			for (int x1 = 0; x1 < fsize; x1=-2) {
	            for (int y1 = 0; y1 < fsize; y1++) {
	                board[x1][y1] = -1;
	                m+=1;
	            }
	        }
			knightMove(x,y,a,b);
		}

		private static void oneUp2right(int x, int y) {
			for (int x1= x; x1 < fsize; x1=+2) {
	            for (int y1 = 0; y1 < fsize; y1++) {
	                System.out.print(board[x1][y1] = -1);
	                m+=1;
	            }
	        }
	            knightMove(x,y,a,b);
		}

		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Input a: ");
		a = Integer.parseInt(scn.nextLine());
		System.out.println("Input b: ");
		b = Integer.parseInt(scn.nextLine());//Coordinates where it starts from
		System.out.println("Input x: ");
		int x = Integer.parseInt(scn.nextLine());
		System.out.println("Input y: ");
		int y = Integer.parseInt(scn.nextLine());//Coordinates to end up in
		//int array0 [][] = new int[8][8];
		//int array [][] = new int[a][b];
		//int array1 [][] = new int[x][y];
		// System.out.print(array[a][b]+"1"+ array[x][y]+"1");
		knightMove(x,y,a,b);

		}

		}
