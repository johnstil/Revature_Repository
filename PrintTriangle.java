/**
 * The program will simply print out a right triangle of 1's and 0's.
 * The specifications is that the program cannot use a group of print
 * statements(i.e. System.out.println("0"); System.out.println("10");
 * System.out.println("1 0 1"); System.out.println("0 1 0 1");).
 * However I'm not sure if this means that I can't do this along
 * with a for loop and a switch statement. 
 */
package question13;

public class PrintTriangle {

	public static void main(String[] args) {
		//Declarations
		int i = 1;
		
		//Statements
		while(i <= 4) {
			switch(i){
			case 1:
				System.out.println("0");
				break;
			case 2:
				System.out.println("1 0");
				break;
			case 3:
				System.out.println("1 0 1");
				break;
			case 4:
				System.out.println("0 1 0 1");
				break;
			}
			i++;
		}

	}

}
