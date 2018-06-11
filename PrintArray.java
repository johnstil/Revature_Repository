/**
 * This program simply prints out the even numbers from 1-100
 */

package question12;

public class PrintArray {
	
	public static void setElements(int[] num) {
		//Statements
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
	}
	
	public static void printElements(int[] num) {
		System.out.print("All even numbers from 1-100: ");
		for(int i : num) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//Declarations
		int[] numArray = new int[100];
		
		//Statements
		setElements(numArray);
		printElements(numArray);
		
	}

}
