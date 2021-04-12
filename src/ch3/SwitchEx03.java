package ch3;

public class SwitchEx03 {

	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700");
			break;
		case "과장":
			System.out.println("600");
			break;
		case "팀장":
			System.out.println("500");
			break;
		default:
			System.out.println("400");
			break;
		}
	}

}
