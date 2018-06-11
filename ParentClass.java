package question18;

import java.util.Scanner;

abstract class ParentClass {
	private String string;
	private Scanner scan = new Scanner(System.in);
	
	public ParentClass() {
		setString();
	}
	
	public ParentClass(String string) {
		setString(string);
	}
	
	public void setString() {
		System.out.print("Please type in an input: ");
		this.string = scan.nextLine();
	}
	
	public void setString(String string)
	{
		this.string = string;
	}
	
	public String getString() {
		return this.string;
	}
	
	abstract boolean upper();
	abstract String lowerToUpper();
	abstract void StringToInteger();
}
