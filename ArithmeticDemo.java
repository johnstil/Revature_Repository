package question15;

public class ArithmeticDemo {

	public static void main(String[] args) {
		IntegerClass integer = new IntegerClass(9, 9);
		FloatClass floats = new FloatClass(12.5f, 3.6f);
		DoubleClass doubles = new DoubleClass(3.45, 5.65);
		
		integer.printStatement();
		System.out.println();
		floats.printStatement();
		System.out.println();
		doubles.printStatement();

	}

}
