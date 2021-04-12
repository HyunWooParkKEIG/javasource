package ch8;

public class HankookTire extends Tire{
	
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		return true;
	}

}
