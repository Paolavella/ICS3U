package objects;
import java.util.ArrayList;
import java.util.Scanner;
public class SchoolSystem {
	static Scanner scn = new Scanner(System.in);
	static ArrayList <Student> listOfStudents= new ArrayList<Student>(500);
	static int n = 0;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int StudentRecord = 300000000;
		
		System.out.println("What would you like to do: \nAdd new student enter 1 \nPrint a Student enter 2 \nPrint all students enter 3 \nRemove a Student enter 5 \nTo quit enter 10.");
		int choice = Integer.parseInt(scn.nextLine());
		if(choice==1){
			addNewStudent(StudentRecord);
		}
		if(choice==2){
			printStudent();
		}
		if(choice==3){
			printAllStudents();
		}
		if(choice==4){
			removeStudent();
		}
		if(choice==5){
			removeStudent();
		}
		if(choice==10){
			System.exit(0);
		}
		else
			System.out.println("Wrong input. Enter right number next time.");

	}
	public static int addNewStudent (int n){
boolean flag = false;


//setArrayList[n];
		
 		Student student1= new Student();
		Student student2= new Student("Paola", "Villavicencio");
		Student student3= new Student();

		System.out.print("Input Name:");
		student1.setFirstName(scn.nextLine());
		System.out.print("Input Last name:");
		student1.setLastName(scn.nextLine());
		System.out.print("Input Street Address:");
		student1.setStreetA(scn.nextLine());
		do{
			System.out.print("Input Phone Number:");// Get the number from new student
			try {
				student1.setPhoneNumber(scn.nextLine());
			} catch (InvalidInputException e) {
				
				e.printStackTrace();
				flag = true;
			}
		}while(flag);
		System.out.print("Input Birthdate:");
		student1.setBirthDate(scn.nextLine());
		System.out.print("Input PostCode:");
		try {
			student1.setPostCode(scn.nextLine());
		} catch (InvalidInputException e) {
			
			e.printStackTrace();
			flag = true;
		}
		

		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getStreetA());
		System.out.println(student1.getPhoneNumber());
		System.out.println(student1.getBirthDate());
		System.out.println(student1.getpostCode());
		addNewStudent(n+1);
		
}
	public static void printStudent (){
		System.out.print("Input the number of Student you want to print:");
		int studNum= scn.nextInt();
		System.out.print(listOfStudents.get(studNum));

	}

	public static void printAllStudents (){
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getStreetA());
		System.out.println(student1.getPhoneNumber());
		System.out.println(student1.getBirthDate());
		System.out.println(student1.getPostCode(null));
	}
	public static void removeStudent (){
		System.out.println("Which student do you want to remove:");
		int i = Integer.parseInt(scn.nextLine());
ArrayList.set(i, Student);
	}
}
