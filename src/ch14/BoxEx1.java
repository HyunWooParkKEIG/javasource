package ch14;

public class BoxEx1 {

	public static void main(String[] args) {
		Box1 box = new Box1();
		
		box.setItem("홍길동");
		System.out.println(box.getItem());
		
		box.setItem(33);
		System.out.println(box.getItem());
		
		box.setItem(33.14f);
		System.out.println(box.getItem());
		
		box.setItem(true);
		System.out.println(box.getItem());
	}

}
