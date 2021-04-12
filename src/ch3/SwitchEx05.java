package ch3;

import java.util.Scanner;

public class SwitchEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3 + 1);
		
		switch (user) {
		case 1:
			if (com == 2) {
				System.out.println("com win");
			} else if (com == 3) {
				System.out.println("user win");
			} else {
				System.out.println("draw");
			}
			break;
		case 2:
			if (com == 2) {
				System.out.println("com win");
			} else if (com == 3) {
				System.out.println("user win");
			} else {
				System.out.println("draw");
			}
			break;
		case 3:
			if (com == 2) {
				System.out.println("com win");
			} else if (com == 3) {
				System.out.println("user win");
			} else {
				System.out.println("draw");
			}
			break;

		default:
			break;
		}
	}

}
