package ch3;

import java.util.Scanner;

public class SwitchEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		score /= 10;
		
		switch (score) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;

		default:
			System.out.println("F");
			break;
		}
	}

}
