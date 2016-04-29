package villavicencio;
/* ArraysDice.java
 * this program stores addition of random numbers then displays the number of times it got the same result from 2 to 12 
 * Paola Villavicencio
 * April 23 2016
 */


public class ArraysDice {

	public static void main(String[] args) {
		System.out.println("Beginning");

		int dice;
		int dice2;
		int [] nums = {0,0,0,0,0,0,0,0,0,0,0};

		for(int i = 0; i < 10000; i++ ){

			dice = (int)(Math.random()* 6) +1;
			dice2 = (int)(Math.random()* 6) +1;

			int n = dice + dice2; 
			if (n == 2){
				nums[0]++;
			}
			else if (n == 3){
				nums[1]++;
			}
			else if (n == 4){
				nums[2]++;
			}
			else if (n == 5){
				nums[3]++;
			}
			else if (n == 6){
				nums[4]++;
			}
			else if (n == 7){
				nums[5]++;
			}
			else if (n == 8){
				nums[6]++;
			}
			else if (n == 9){
				nums[7]++;
			}
			else if (n == 10){
				nums[8]++;
			}
			else if (n == 11){
				nums[9]++;
			}
			else if (n == 12){
				nums[10]++;
			}

		}


		int totalNumber = 1;
		System.out.println("      Total                                                NUMBER OF ROLLS");

		for(int i = 0; i <= nums.length -1; i++ ){
			totalNumber = totalNumber + 1; 
			System.out.println( totalNumber + "                                     " + nums[i]);
		}


	}

}
