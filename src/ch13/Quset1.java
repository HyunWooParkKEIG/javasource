package ch13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quset1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> arrayList = new ArrayList<Character>();
		
		StringTokenizer token = new StringTokenizer(sc.nextLine());
		
		while (token.hasMoreTokens()) {
			arrayList.add(token.nextToken().charAt(0));
		}
		
		for (int i = 0; i < arrayList.size(); i++) {
			switch (arrayList.get(i)) {
			case 'A':
				System.out.print("4.0 ");
				break;
			case 'B':
				System.out.print("3.0 ");
				break;
			case 'C':
				System.out.print("2.0 ");
				break;
			case 'D':
				System.out.print("1.0 ");
				break;
			case 'F':
				System.out.print("0.0 ");
				break;

			default:
				break;
			}
		}
	}

}
