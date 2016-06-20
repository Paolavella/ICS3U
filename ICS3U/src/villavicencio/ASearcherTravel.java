package villavicencio;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class ASearcherTravel {
	static Console c = new Console (47, 157);
	public static BufferedImage load = null, Plane =null, ageOld= null, Travel = null, Company = null, noMoney= null, less18= null, yourBudget = null, Mexico = null, Copenhagen = null, Geneva = null, Helsinki = null, London = null, Luxem = null, NewYork = null, Oslo = null, Paris = null, Singapore = null, Stockholm= null, Sydney = null, Tokyo = null, Toronto = null, Vienna = null, Zurich = null;

	public static void main(String[] args) throws InterruptedException {
		//Set background color to black

		c.setTextBackgroundColor(Color.BLACK);
		c.clear();
		//Set font color to white
		c.setTextColor(Color.WHITE);
		try{
			//boolean newPlace = false;
			//for repeat loop
			boolean repeat= true;
			String[] names;	
			double budget;
			int n;
			int age;
			//Pictures being used
			load =ImageIO.read(new File("src/villavicencio/expesive_pics/load.gif"));
			noMoney =ImageIO.read(new File("src/villavicencio/expesive_pics/noMoney.jpg"));
			less18 =ImageIO.read(new File("src/villavicencio/expesive_pics/less18.jpg"));
			Plane =ImageIO.read(new File("src/villavicencio/expesive_pics/plane.jpg"));
			Travel =ImageIO.read(new File("src/villavicencio/expesive_pics/traveltheworld.jpg"));
			Company =ImageIO.read(new File("src/villavicencio/expesive_pics/company.jpg"));
			yourBudget =ImageIO.read(new File("src/villavicencio/expesive_pics/budget.jpg"));
			ageOld = ImageIO.read(new File("src/villavicencio/expesive_pics/old.jpg"));
			// Pictures expensive and cheap places 
			Mexico =ImageIO.read(new File("src/villavicencio/expesive_pics/Mexicoplayadelcarmen.jpg"));
			Copenhagen =ImageIO.read(new File("src/villavicencio/expesive_pics/Copenhagen.jpg"));
			Geneva =ImageIO.read(new File("src/villavicencio/expesive_pics/Geneva.jpg"));
			Helsinki =ImageIO.read(new File("src/villavicencio/expesive_pics/Helsinki.jpg"));
			London =ImageIO.read(new File("src/villavicencio/expesive_pics/London.jpg"));
			Luxem =ImageIO.read(new File("src/villavicencio/expesive_pics/Luxembourg.jpg"));
			NewYork=ImageIO.read(new File("src/villavicencio/expesive_pics/New_York_City.jpg"));
			Oslo =ImageIO.read(new File("src/villavicencio/expesive_pics/Oslo.jpg"));
			Paris =ImageIO.read(new File("src/villavicencio/expesive_pics/Paris.jpg"));
			Singapore =ImageIO.read(new File("src/villavicencio/expesive_pics/Singapore.jpg"));
			Stockholm = ImageIO.read(new File("src/villavicencio/expesive_pics/Stockholm.jpg"));
			Sydney = ImageIO.read(new File("src/villavicencio/expesive_pics/Sydney.jpg"));
			Tokyo = ImageIO.read(new File("src/villavicencio/expesive_pics/Tokyo.jpg"));
			Toronto =ImageIO.read(new File("src/villavicencio/expesive_pics/Toronto.jpg"));
			Vienna =ImageIO.read(new File("src/villavicencio/expesive_pics/Vienna.jpg"));
			Zurich =ImageIO.read(new File("src/villavicencio/expesive_pics/Zurich.jpg"));

			while (repeat){
				c.drawImage(load, 200, 100, 900, 900, null);
				Thread.sleep(1500);
				//explaining instructions
				c.println("Welcome to traveler ! WE WILL HELP YOU CHOOSE WHERE IS THE BEST TO VISIT PLACE FOR YOU.");
				c.drawImage(Travel, 200, 100, 900, 900, null);
				c.println("In this agency you should travel with people.");
				c.println("How many people are traveling?");
				n = c.readInt();
				c.clear();
				
				if (n==0){
					c.println("That is is not posible, there should be a number greater than or equals to one.Try again.");
					c.println("Enter a valid number of people");
					c.drawImage(Plane, 200, 100, 900, 900, null);
					n = c.readInt();
					if (n>=1){
						repeat = true;
						c.clear();
					}
					else{
						c.println("Not valid, double click to exit");
						repeat = false;
						String Exit = c.readLine();
						c.close();
						}
				}
				else if (n>=1){
						repeat = true;
						c.clear();
					}
				
				else{
					c.print("Invalid input. Double enter to exit");
					String Exit = c.readLine();
					repeat = false;
					c.close();
				    }
					names  = new String[n];
					for (int i = 0; i < n; i++){	
						c.println("Enter Name (no numbers allowed):");
						c.drawImage(Company, 200, 100, 900, 900, null);
						names [i] = c.readLine();
					}
					c.clear();
					c.drawImage(yourBudget, 200, 100, 900, 900, null);
					c.println("Enter your Budget (Enter no more than 7 digits):");
					budget = c.readDouble();
					if (budget<500){
						c.println("You are too poor to travel. Try another time.");
						c.drawImage(noMoney, 200, 100, 900, 900, null);
						c.print("Double enter to exit");
						String Exit = c.readLine();
						c.close();
					}

					else if(budget > 9999999) 
					{
						c.println("It had to be less than seven integers. Double enter to exit.");
						repeat = false;
						String Exit = c.readLine();
						c.close();
					}
					else{
						c.clear();
						// At this stage names, number of people going and budget are obtain	
						c.println("Enter your Age:");// age is obtain from user
						c.drawImage(ageOld, 200, 100, 900, 900, null);
						age = c.readInt();
						c.clear();
						if (age <18){// If the user is less than 18 they can't continue since in reality just people older than 18 can travel
							c.println("You are too young to travel by yourself. Tell an older person.");
							c.drawImage(less18, 200, 100, 900, 900, null);
							repeat = false;
							c.print("Double enter to exit");
							String Exit = c.readLine();
							c.close();
						}
						else if (age >= 40 && age <123){// If they are older than 40 they continue into a the elder method for specific places
							elderMethod(names, budget);
							c.println("Would you like to repeat the process again? (yes enter y or no enter n)");
							c.drawImage(Plane, 200, 100, 900, 900, null);
							String answer1 = c.readLine();
							if (answer1.equals("y")){
								c.clear();
								repeat = true;
							}
							else{
								c.print("Double enter to exit");
								String Exit = c.readLine();
								repeat = false;
								c.close();
							}
						}
						else if (age>=18 && age<40) {
							normalMethod(names, budget);//Younger than 40 would continue with the places included in the normal method

							c.println("Would you like to repeat the process again?(yes enter y or no enter n)");
                            c.drawImage(Plane, 200, 100, 900, 900, null);
							String answer1 = c.readLine();
							if (answer1.equals("y")){
								c.clear();
								repeat = true;
							}
							else{
								repeat = false;
								c.close();
							}
						}
						else{
							c.println("This age is not possible.");
							c.print("Double enter to exit");
							String Exit = c.readLine();
							repeat = false;
							c.close();

						}
					}
			}
		}

		catch (Exception e) {
			e.printStackTrace();}
	}
	public static void elderMethod(String[] names, double x) {// the methods continue depending on the budget
		if (x >=1000 && x<=1000000){// more fitted places for their budget more than 1000
			c.println("You have a fair budget. This is the place for you to go.");
			c.println("");
			// display of pictures and names
			c.println("People called: " + (Arrays.toString(names))+ ", "); 
			c.println("should travel to either:");
			c.println("Place: Geneva,()");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Geneva, 200, 200, 800, 800, null);
			String n = c.readLine();
			c.clear();
			c.println("Place: Helsinki (Finland),");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Helsinki, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Oslo (Norway) or");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Oslo, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Playa del Carmen (Mexico).");
			c.println("Press double enter for next page.");
			c.drawImage(Mexico, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();

		}
		else if (x <=1000 && x >= 500){// more fitted places for their budget less than 1000
			c.println("To fit your budget. This is the place for you to go.");
			c.println("");
			// display of pictures and names 
			c.println("People called: " + (Arrays.toString(names))+ ", ");
			c.println("should travel to either:");
			c.println("Place: Luxembourg city (Luxembourg),");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Luxem, 200, 200, 800, 800, null);
			String n = c.readLine();
			c.clear();

			c.println("Place: Copenhagen (Sweden),");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Copenhagen, 200, 100, 900, 900, null);
			n = c.readLine();

			c.clear();
			c.println("Place: London (England) or");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(London, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();

			//displaying next picture with name
			c.println("Place: New York (U.S.A.).");
			c.println("Press double enter for next page.");
			c.drawImage(NewYork, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();

		}
		else {
			c.println("You are too poor to travel. Try another time.");
			c.drawImage(noMoney, 200, 100, 900, 700, null);
			c.print("Double enter to exit");
			String Exit = c.readLine();
			c.close();

		}

	}
	public static void normalMethod(String[] names, double x) {
		if (x >=1000 && x <= 100000){// more fitted places for their budget less than 1000
			c.println("You have a fair budget. This is the place for you to go.");
			// display of pictures and names
			c.println("People called: " + (Arrays.toString(names))+ ", "); 
			c.println("should travel to either:");
			c.println("Place: Sydney,()");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Sydney, 200, 200, 800, 800, null);
			String n = c.readLine();
			c.clear();
			c.println("Place: Vienna,()");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Vienna, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Zurich () or");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Zurich, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Toronto (Canada).");
			c.println("Press double enter for next page.");
			c.drawImage(Toronto, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
		}

		else if (x <=1000 && x >= 500){// more fitted places for their budget more than 1000
			c.println("For your budget. This is the place for you to go.");
			c.println("");
			c.println("Keep pressing double enter to see the next place:");
			// display of pictures and names
			c.println("People called: " + (Arrays.toString(names)) + ", ");
			c.println("should travel to either:");
			c.println("Place: Paris (France),");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Paris, 200, 200, 800, 800, null);
			String n = c.readLine();
			c.clear();
			c.println("Place: Singapore (Singapore state),");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Singapore, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Stolckholm (Sweden) or");
			c.println("Keep pressing double enter to see the next place:");
			c.drawImage(Stockholm, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();
			c.println("Place: Tokyo (Japan).");
			c.println("Press double enter for next page.");
			c.drawImage(Tokyo, 200, 100, 900, 900, null);
			n = c.readLine();
			c.clear();		
		}
		else {
			c.println("You are too poor to travel. Try another time.");
			c.drawImage(noMoney, 200, 100, 900, 900, null);
			c.print("Double enter to exit");
			String Exit = c.readLine();
			c.close();
			

		}
	}


}

