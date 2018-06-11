package question9;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		List<Integer> arrayOfNumbers = new ArrayList<>();
		
		for(Integer i = 1; i <= 100; i++) {
			arrayOfNumbers.add(i);
		}
		
		System.out.print("Primes from 1-100: ");
		
		for(Integer number : arrayOfNumbers) {
			for(Integer i = 2; i < number; i++) {
				if(number % i == 0) {
					break;
				}else if(i == (number - 1)) {
					System.out.print(number + " ");
				}
			}
		}

	}

}
