package question19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arrayofNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> arrayofPrimes = new ArrayList<>();
		Integer sumEven = Integer.valueOf(0);
		Integer sumOdd = Integer.valueOf(0);
		
		System.out.print("Elements of the array list: ");
		arrayofNumbers.forEach(System.out::print);
		System.out.println();
		
		for(Integer number : arrayofNumbers) {
			if(number % 2 == 0) {
				sumEven += number;
			}else {
				sumOdd += number;
			}
		}
		
		for(Integer number : arrayofNumbers) {
			for(Integer i = 2; i < number; i++) {
				if(number % i == 0) {
					break;
				}else if(i == (number - 1)) {
					arrayofPrimes.add(number);
				}
			}
		}
		
		for(Integer number : arrayofPrimes) {
			arrayofNumbers.remove(number);
		}
		
		System.out.println("Sum of even numbers between 1-10: " + sumEven);
		System.out.println("Sum of odd numbers between 1-10: " + sumOdd);
		System.out.print("New arraylist with primes remove: ");
		arrayofNumbers.forEach(System.out::print);
	}

}
