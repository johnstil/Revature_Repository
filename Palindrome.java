package question8;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	
	public static void buildStringList(String[] string, List<String> list) {
		for(String word : string) {
			list.add(word);
		}
	}
	
	public static void buildStringBuffer(String[] string, StringBuilder[] buffer) {
		for(int i = 0; i < string.length; i++) {
			buffer[i] = new StringBuilder("");
			buffer[i].append(string[i]);
		}
		
	}
	
	public static void buildPalindrome(StringBuilder[] buffer, List<String> list) {
		for(int i = 0; i < buffer.length; i++) {
			if(buffer[i].reverse().toString().compareTo(list.get(i)) == 0) {
				list.add(buffer[i].toString());
			}
		}
	}
	
	public static void printListItems(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Declarations
		String[] strings = {"karan", "madam", "tom", 
				          "civic", "radar", "sexes", 
				          "jimmy", "kayak", "john",  
				          "refer", "billy", "did"};
		StringBuilder[] stringBuffer = new StringBuilder[strings.length];
		List<String> stringList = new ArrayList<String>();
		List<String> palindrome = new ArrayList<String>();
		
		//Statements
		buildStringList(strings, stringList);
		printListItems(stringList);
		buildStringBuffer(strings, stringBuffer);
		buildPalindrome(stringBuffer, palindrome);
		printListItems(palindrome);
		
		

	}

}
