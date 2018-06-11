package question15;

public class FloatClass implements BasicArthimetic{
	float number1, number2;
	
	public FloatClass() {
		this.number1 = 1.0f;
		this.number2 = 1.0f;
	}
	
	public FloatClass(float number1, float number2) {
		setNumber1(number1);
		setNumber2(number2);
	}
	
	public void setNumber1(float number1) {
		this.number1 = number1;
	}
	
	public void setNumber2(float number2) {
		this.number2 = number2;
	}
	
	public float getNumber1() {
		return this.number1;
	}
	
	public float getNumber2() {
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
