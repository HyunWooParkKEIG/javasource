package ch5;

public class CardEx {

	public static void main(String[] args) {
		Card cd1 = new Card(7, "heart");
		Card cd2 = new Card(7, "heart");
		
		print(cd1);
		print(cd2);
		
	}
	
	static void print (Card card) {
		System.out.println("card number : " + card.number);
		System.out.println("card kind : " + card.kind);
		System.out.println("card width : " + Card.width);
		System.out.println("card height : " + Card.height);
	}

}
