package question6;

import java.util.Scanner;

public class Even {
	static Scanner scan = new Scanner(System.in);
	public static int userInput;
	
	public static void printIntro() {
		System.out.println("This program will determine if the user input(integer) is even.");
		System.out.println();
	}
	
	public static int setUserInput() {
		System.out.print("Please type in an integer: ");
		while(true) {
			if(scan.hasNextInt()) {
				return scan.nextInt();
			}else {
				System.out.println("Please input an integer: ");
				scan.next();
			}
		}
	}
	
	public static void even(int num) {
		if(2 * (num / 2) == num) {
			System.out.println(num + " is even");
		}else {
			System.out.println(num + " is not even");
		}
	}
	
	public static void main(String[] args) {
		printIntro();
		userInput = setUserInput();
		even(userInput);
	}

}
