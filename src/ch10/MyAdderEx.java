package ch10;

public class MyAdderEx {

	public static void main(String[] args) {
		AdderInterface adder = new MyAdder();
		System.out.println(adder.add(1, 2));
		System.out.println(adder.sum(4));
	}

}
