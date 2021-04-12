package ch3;

import java.util.Scanner;

public class IfEx12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weight = sc.nextInt();
		int height = sc.nextInt();
		
		int cal = (int)((height - 100) * 0.9);
		
		if(weight > cal) {
			System.out.println("over");
		} else if(weight == cal) {
			System.out.println("Standard");
		} else {
			System.out.println("low");
		}
	}

}
