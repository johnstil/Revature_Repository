package question15;

public class DoubleClass implements BasicArthimetic{
	private double number1, number2;
	
	public DoubleClass() {
		this.number1 = 1.0;
		this.number2 = 1.0;
	}
	
	public DoubleClass(double number1, double number2) {
		setNumber1(number1);
		setNumber2(number2);
	}
	
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public double getNumber1() {
		return this.number1;
	}
	
	public double getNumber2() {
		return this.number2;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(getNumber1() + " + " + getNumber2() + " = " + (getNumber1()
		           + getNumber2()));
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(getNumber1() + " - " + getNumber2() + " = " + (getNumber1()
		           - getNumber2()));
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		System.out.println(getNumber1() + " * " + getNumber2() + " = " + (getNumber1()
		           * getNumber2()));
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		try {
			System.out.println(getNumber1() + " / " + getNumber2() + " = " + (getNumber1()
			           / getNumber2()));
		}catch(ArithmeticException e) {
			System.out.println("Invalid division can not divid by zero");
		}
	}

	public void printStatement() {
		add();
		sub();
		mult();
		div();
	}
}
