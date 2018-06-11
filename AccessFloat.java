package question11_2;

public class AccessFloat {
	private float flt1;
	private float flt2;
	
	public AccessFloat(){
		setFloat1();
		setFloat2();
	}
	
	public void setFloat1() {
		this.flt1 = (float) 35.1;
	}
	
	public void setFloat2() {
		this.flt2 = (float) 3.22;
	}
	
	public float getFloat1() {
		return this.flt1;
	}
	
	public float getFloat2() {
		return this.flt2;
	}
}
