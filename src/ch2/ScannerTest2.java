package ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result = (num > 0)? "양수" : (num == 0)? "0" : "음수";
		System.out.println(result);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

}
