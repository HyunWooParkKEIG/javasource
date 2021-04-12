package ch3;

public class SwitchEx04 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*4 + 8);
		
		switch (num) {
		case 8:
			System.out.println("chul");
			break;
		case 9:
			System.out.println("con");
			break;
		case 10:
			System.out.println("do");
			break;
		case 11:
			System.out.println("go");
			break;

		default:
			break;
		}
		
	}

}
