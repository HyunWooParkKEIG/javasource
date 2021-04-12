package ch5;

public class Card {
	
	int number;
	String kind;
	
	static int width = 100;
	static int height = 100;
	
	public Card() {}
	
	public Card (int number, String kind) {
		this.number = number;
		this.kind = kind;
	}
}
