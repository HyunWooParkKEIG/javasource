package ch8;

public class Tire {
	
	private int maxRotat;
	private String location;
	
	public Tire(int maxRotat, String location) {
		this.maxRotat = maxRotat;
		this.location = location;
	}
	
	public boolean roll() {
		return true;
	}
}
