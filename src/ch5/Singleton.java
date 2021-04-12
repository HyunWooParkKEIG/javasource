package ch5;

public class Singleton {
	
	private static Singleton single;
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		if(single == null) {
			single = new Singleton();
		}
		
		return single;
	}
}
