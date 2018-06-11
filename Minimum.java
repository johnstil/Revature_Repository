package question10;

import java.util.Scanner;

/**
 * This program simply compares two inputs from the user. The input must be either an
 * integer, float or double. This version of the program is overkill. The problem does
 * not specify what input the user would use (assuming it is a number). So to handle this 
 * I gave the user the option of selecting what type of input they wanted to use.
 * The program checks for valid inputs.
 * @author Timothy
 *
 */

public class Minimum {
	public static void printIntroduction() {
		System.out.println("The program will compare two number.");
		System.out.println("These numbers will be typed in by the user.");
		System.out.println("These numbers can be either integers, floats or doubles.");
		System.out.println("-----------<Menu>----------------");
		System.out.println("1. Integer");
		System.out.println("2. Floats");
		System.out.println("3. Doubles" );
		System.out.print("Please type in the number for one of the above options: ");
	}
	
	public static int getInput() {
		//Local Declarations
		Scanner input = new Scanner(System.in);
		
		while(true) {
			if(input.hasNextInt()) {
				return input.nextInt();
			}else {
				System.out.print("Please type in the number for one of the above options: ");
				input.next();
			}
		}
		
	}
	
	public static int setInteger1() {
		//Local Declarations
		Scanner input1 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in a number: ");
		
		while(true) {
			if(input1.hasNextInt()) {
				return input1.nextInt();
			}else {
				System.out.print("Input must be an integer: ");
				input1.next();
			}
		}
	}
	
	public static int setInteger2() {
		//Local Declarations
		Scanner input2 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in another number: ");
		while(true) {
			if(input2.hasNextInt()) {
				return input2.nextInt();
			}else {
				System.out.print("Input must be an integer: ");
				input2.next();
			}
		}
	}
	
	public static float setFloat1() {
		//Local Declarations
		Scanner floatInput1 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in a number: ");
		
		while(true) {
			if(floatInput1.hasNextFloat()) {
				return floatInput1.nextFloat();
			}else {
				System.out.print("Input must be a integer: ");
				floatInput1.next();
			}
		}
	}
	
	public static float setFloat2() {
		//Local Declarations
		Scanner floatInput2 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in a number: ");
		
		while(true) {
			if(floatInput2.hasNextFloat()) {
				return floatInput2.nextFloat();
			}else {
				System.out.print("Input must be a float: ");
				floatInput2.next();
			}
		}
	}
	
	public static double setDouble1() {
		//Local Declarations
		Scanner doubleInput1 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in a number: ");
		
		while(true) {
			if(doubleInput1.hasNextDouble()) {
				return doubleInput1.nextFloat();
			}else {
				System.out.print("Input must be a double percision number: ");
				doubleInput1.next();
			}
		}
	}
	
	public static double setDouble2() {
		//Local Declarations
		Scanner doubleInput2 = new Scanner(System.in);
		
		//Statements
		System.out.print("Please type in a number: ");
		
		while(true) {
			if(doubleInput2.hasNextDouble()) {
				return doubleInput2.nextFloat();
			}else {
				System.out.print("Input must be a double percision number: ");
				doubleInput2.next();
			}
		}
	}
	
	public static void findMinimum(int input1, int input2) {
		String string;
		if(input1 == input2) {
			string = input1 + " and " + input2 + "are equal.";
			System.out.println(string);
			return;
		}
		string = (input1 > input2 ) ? "The minimum is " + input2: "The minimum is " + input1;
		System.out.println(string);
	}
	
	public static void findMinimum(double input1, double input2) {
		String string;
		if(input1 == input2) {
			string = input1 + " and " + input2 + "are equal.";
			System.out.println(string);
			return;
		}
		string = (input1 > input2 ) ? "The minimum is " + input2: "The minimum is " + input1;
		System.out.println(string);
	}
	
	public static void findMinimum(float input1, float input2) {
		String string;
		if(input1 == input2) {
			string = input1 + " and " + input2 + "are equal.";
			System.out.println(string);
			return;
		}
		string = (input1 > input2 ) ? "The minimum is " + input2: "The minimum is " + input1;
		System.out.println(string);
		
	}
	

	public static void main(String[] args) {
		int choice, num1, num2;
		float flt1, flt2;
		double dbl1, dbl2;
		
		//Statements
		printIntroduction();
		System.out.println();
		choice = getInput();
		
		switch(choice) {
			case 1:
				num1 = setInteger1();
				num2 = setInteger2();
				findMinimum(num1, num2);
				break;
			case 2:
				flt1 = setFloat1();
				flt2 = setFloat2();
				findMinimum(flt1, flt2);
				break;
			case 3:
				dbl1 = setDouble1();
				dbl2 = setDouble2();
				findMinimum(dbl1, dbl2);
				break;
			default:
				System.out.println("Invalide Input");
		}
		

	}

}
