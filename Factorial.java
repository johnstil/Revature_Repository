package question4;

import java.util.Scanner;

public class Factorial {
	static Scanner scan = new Scanner(System.in);
	public static int num;
	
	public static void printIntro() {
		System.out.println("This program will take an integer input and ");
		System.out.println("calculate the factorial of the number.");
	}
	
	public static int getNum() {
		System.out.print("Please type in an integer: ");
		return scan.nextInt();
		
	}
	
	public static void factorial(int input) {
		long answer = 1;
		for(int i = 0; i <= input; i++) {
			if(i == 0) {
				
			}else {
				answer *= i;
			}
		}
		System.out.println(input + "! is " + answer);
	}
	
	public static int recursiveFact(int input) {
		if(input == 0) {
			return 1;
		}else {
			return input * recursiveFact(input - 1);
		}
	}
	
	public static void main(String args[]) {
		//Statements
		printIntro();
		System.out.println();
		num = getNum();
		factorial(num);
		System.out.println("Recursive Factorial: " + recursiveFact(num));
	}

}
