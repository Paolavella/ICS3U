package villavicencio;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int dice1;
		int dice2;
		int user1;
		int user2;
		
		
	    
		
		// preparing rolling dice user1
		dice1 = (int) (Math.random() * 6 + 1);
		dice2 = (int) (Math.random() * 6 + 1);
		user1 = dice1 + dice2;
		
		System.out.println("UserPal number is " +user1);
		
		
		//rolling dice for user2
		dice1 = (int) (Math.random() * 6 + 1);
		dice2 = (int) (Math.random() * 6 + 1);
		user2 = dice1 + dice2;
		
		System.out.println("UserHal number is " +user2);
		
		
		if (user2 == user1) {
			System.out.println("IT IS A TIE!");
		}
		
		else if (user1 < user2) {
			System.out.println("UserHat Wins!");
		}
		else
			System.out.println("UserPal Wins!");
		
		
		
		
	}

}
