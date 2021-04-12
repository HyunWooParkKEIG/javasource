package ch3;

import java.util.Scanner;

public class ifEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("0");
		} else {
			System.out.println("Not 0");
		}
	}

}
