package ch3;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int answer = 10;
		
		do {
			input = sc.nextInt();
			
			if (answer < input) {
				System.out.println("low");
			} else {
				System.out.println("up");
			}
			
		} while (input != 1);
	}

}
