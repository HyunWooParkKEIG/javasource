package ch3;

import java.util.Scanner;

public class ForEx10 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 1;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
			sum *= i;
		}
		
		System.out.println(sum);
	}

}
