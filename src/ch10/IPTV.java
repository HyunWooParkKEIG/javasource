package ch10;

public class IPTV extends ColorTV{
	
	private String address;
	
	public IPTV(int size, int property, String address) {
		super(size, property);
		this.address = address;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 " + address + " 주소의 " + super.getSize() + "인치 " + super.getProperty() + "컬러");
	}
	
}
