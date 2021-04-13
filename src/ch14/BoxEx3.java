package ch14;

public class BoxEx3 {

	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3<>();
		Box3<Apple> appleBox = new Box3<>();
		Box3<Toy> toyBox = new Box3<>();
		
		fruitBox.add(new Fruit());
		System.out.println(fruitBox.toString());
		
		fruitBox.add(new Apple());
		System.out.println(fruitBox.toString());
		
		fruitBox.add(new Grape());
		System.out.println(fruitBox.toString());

		fruitBox.add(new Apple());
		System.out.println(fruitBox.toString());

		appleBox.add(new Apple());
		System.out.println(fruitBox.toString());
		
		//fruitBox.add(new Grape());
		//System.out.println(fruitBox.toString());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox.get(1));
		System.out.println(fruitBox.size());

		System.out.println(appleBox.get(0));
		System.out.println(appleBox.size());

		System.out.println(toyBox.get(0));
		System.out.println(toyBox.size());
	}

}
