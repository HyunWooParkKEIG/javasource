package ch14;

public class BoxEx2 {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		
		box.setItem("홍길동");
		System.out.println(box.getItem());
		
//		box.setItem(33);
//		System.out.println(box.getItem());
//		
//		box.setItem(33.14f);
//		System.out.println(box.getItem());
//		
//		box.setItem(true);
//		System.out.println(box.getItem());
	}

}
