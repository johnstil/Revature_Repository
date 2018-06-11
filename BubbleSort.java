package question1;
/**
 * 
 * @author Timothy
 * This program will perform a bubble sort on the array provided in the program.
 *
 */

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int temp;
		int iteration = 1;
		int k;
		for(int i = arr.length; i > 0; i--) {
			for(int j = 0; j < i - 1; j++) {
				k = j + 1;
				if(arr[j] > arr[k]) {
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
			printArray(arr, iteration);
			iteration++;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void printArray(int [] arr, int iter) {
		System.out.print("Iteration " + iter + ": ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//Declarations
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
		
		//Statements
		printArray(array);
		bubbleSort(array);
		
		
		
		

	}

}
