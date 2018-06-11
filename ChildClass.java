package question18;

public class ChildClass extends ParentClass{
	private int number;
	
	public ChildClass() {
		super();
	}
	
	public ChildClass(String string) {
		super(string);
	}

	@Override
	boolean upper() {
		for(int i = 0; i < super.getString().length(); i++) {
			if(Character.isUpperCase(super.getString().charAt(i))){
				return true;
			}
		}
		return false;
	}

	@Override
	String lowerToUpper() {
		return super.getString().toUpperCase();
		
	}

	@Override
	void StringToInteger() {
		this.number = Integer.parseInt(super.getString()) + 10;
		System.out.println(super.getString() + " converted to a number + 10 = " + number);
		
		
	}

}
