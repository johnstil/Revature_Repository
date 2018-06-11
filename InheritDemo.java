package question18;

import java.util.Scanner;

public class InheritDemo {
	private static int userInput;
	private static Scanner scanInput;
	private static ChildClass input;
	
	public static void printIntroduction() {
		System.out.println("---------------------<Introduction>-----------------------");
		System.out.println("Program will list a set of options in the menu.");
		System.out.println("User will input the option they wish to have");
		System.out.println("Program will display the desired output");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
	}
	
	public static void printMenu() {
		System.out.println("-----------------------<Menu>-----------------------------");
		System.out.println("1. String Contains Capital Letter");
		System.out.println("2. Convert String to all Upper Case");
		System.out.println("3. Add 10 to string input(must be an integer)");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
	}
	
	public static void userInput() {
		scanInput = new Scanner(System.in);
		System.out.print("Please type in a number: ");
		userInput = scanInput.nextInt();
		
	}
	
	public static void optionExecute() {
		switch(userInput) {
		case 1:
			input = new ChildClass();
			System.out.println(input.getString() + " contains an upper case: " + input.upper());
			break;
		case 2:
			input = new ChildClass();
			System.out.println("To upper case: " + input.lowerToUpper());
			break;
		case 3:
			input = new ChildClass();
			input.StringToInteger();
			break;
		default:
			System.out.println("Invalid Input");
			
	}
	}
	public static void main(String[] args) {
		printIntroduction();
		printMenu();
		userInput();
		optionExecute();

	}

}
