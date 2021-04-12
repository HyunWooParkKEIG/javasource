package ch3;

public class SwitchEx02 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("good");
			break;
		case 'B':
		case 'b':
			System.out.println("cool");
			break;
		case 'C':
		case 'c':
			System.out.println("nice");
			break;
		case 'D':
		case 'd':
			System.out.println("bad");
			break;
		default:
			System.out.println("fire");
			break;
		}
	}

}
