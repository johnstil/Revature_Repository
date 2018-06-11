package question14;

import java.util.Date;
import java.util.Scanner;

/**
 * The program will demonstrate the use of switches. The switch will trigger based
 * on user input.
 * @author Timothy
 *
 */
public class SwitchCase {
	private static Scanner scan = new Scanner(System.in);
	private static int input;
	private static String strings;
	private static String[] stringArray;
	
	public static void printIntroduction() {
		System.out.println("------------------------<Menu>--------------------------");
		System.out.println("1. Finds the square root of the input (must be a number)");
		System.out.println("2. Display today's date");
		System.out.println("3. Splits a statement");
		System.out.println("---------------------------------------------------------");
		System.out.print("Please type in the one of the above: ");
	}
	
	public static int getUserInput() {
		while(true) {
			if(scan.hasNextInt()) {
				return scan.nextInt();
			}else {
				System.out.print("Input must be a number(integer), please type in on of the above: ");
				scan.next();
			}
		}
	}
	
	public static void printSquareRoot() {
		//Statements
		System.out.print("Please type in a number: ");
		while(true) {
			if(scan.hasNextInt() || scan.hasNextDouble() || scan.hasNextFloat()) {
				if(scan.hasNextInt()) {
					System.out.println("Square root of " + scan.nextInt() + " is "
							           + Math.sqrt(scan.nextInt()));
				}else if(scan.hasNextDouble()) {
					System.out.println("Square root of " + scan.nextDouble() + " is "
					           + Math.sqrt(scan.nextDouble()));
				}else{
					System.out.println("Square root of " + scan.nextFloat() + " is "
					           + Math.sqrt(scan.nextFloat()));
				}
			}else {
				System.out.print("Input must be a number, please type in a number: ");
				scan.next();
			}
		}
	}
	
	public static void printCurrentDate() {
		Date date = new Date();
		System.out.println("Todays date: " + date.toString());
	}
	
	public static void setStringArray() {
		scan.nextLine();
		System.out.print("Please type in an expression: ");
		strings = scan.nextLine();
		stringArray = strings.split(" ");
		System.out.println();
	}
	
	public static void printStringArray(String[] string) {
		System.out.print("Reprint expression: ");
		for(String word : string) {
			System.out.print(word + " ");
		}
	}
	
	public static void main(String[] args) {
		// Statements
		printIntroduction();
		input = getUserInput();
		scan.reset();
		switch(input) {
			case 1:
				printSquareRoot();
				scan.reset();
				break;
			case 2:
				printCurrentDate();
				break;
			case 3:
				setStringArray();
				printStringArray(stringArray);
				break;
			default:
				System.out.println("Invalid Input");
					
		}

	}

}
