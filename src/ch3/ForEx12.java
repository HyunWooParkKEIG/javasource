package ch3;

public class ForEx12 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for (int i = 10; i <= 100000; i *= 10) {
			int left = num % i;
			int temp = left / (i / 10);
			sum += temp;
		}
		
		System.out.println(sum);
	}

}
