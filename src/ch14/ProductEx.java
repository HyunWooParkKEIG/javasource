package ch14;

public class ProductEx {

	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car("HyunDai"));
		product2.setModel("펠리세이드");
		
	}

}
