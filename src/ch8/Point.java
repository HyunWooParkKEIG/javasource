package ch8;

public class Point {
	int x;
	int y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")";
	}
	

}
