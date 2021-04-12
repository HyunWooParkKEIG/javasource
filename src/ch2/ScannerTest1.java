package ch2;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}

}
