package ch3;

public class ForEx03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 ==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for (int i = 3; i <= 100; i += 3) {
			System.out.print(i + " ");
		}
	}

}
