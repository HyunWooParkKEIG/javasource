package ch10;

public class ColorTV extends TV {
	private int property;
	
	public ColorTV(int size, int property) {
		super(size);
		this.property = property;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + getProperty() + "컬러");
	}
	
	public int getProperty() {
		return this.property;
	}
}
