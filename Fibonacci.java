package question2;

public class Fibonacci {
	
	public static void fibonacciSeries() {
		//Local Declarations
		int firstNum = 0;
		int secondNum = 1;
		int temp;
		
		System.out.print("The first 25 numbers of the Fibonacci Series: " + firstNum + " " + secondNum);
		for(int i = 0; i < 23; i++) {
			System.out.print(" " + (firstNum + secondNum));
			temp = secondNum;
			secondNum = firstNum + secondNum;
			firstNum = temp;
		}
	}
	
	public static void main(String[] args) {
		fibonacciSeries();

	}

}
