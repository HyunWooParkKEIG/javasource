package ch10;

public abstract class Calc {
	protected int a;
	protected int b;
	
	protected void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract protected int calculate();
	
}
