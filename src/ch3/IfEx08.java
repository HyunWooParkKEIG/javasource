package ch3;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("양슈");
		} else {
			System.out.println("음수");
		}
	}

}
