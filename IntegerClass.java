package question15;

public class IntegerClass implements BasicArthimetic{
	private int number1, number2;
	
	public IntegerClass() {
		this.number1 = 1;
		this.number2 = 1;
	}
	
	public IntegerClass(int number1, int number2) {
		setNumber1(number1);
		setNumber2(number2);
	}
	
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return this.number1;
	}
	
	public int getNumber2() {
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
