package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer token = new StringTokenizer(str, "/");
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	}

}
