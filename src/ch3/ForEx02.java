package ch3;

public class ForEx02 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("\n" + sum);
	}

}
