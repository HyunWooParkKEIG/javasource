package ch13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arrayList = new ArrayList<Double>();
		
		String input = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(input);
		
		while (token.hasMoreTokens()) {
			arrayList.add(Double.parseDouble(token.nextToken()));
		}
		
		double max = Double.MIN_VALUE;
		
		for (int i = 0; i < arrayList.size(); i++) {
			max = Math.max(max, arrayList.get(i));
		}
		
		System.out.println(max);
	}

}
