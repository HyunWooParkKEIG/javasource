package ch13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		StringTokenizer token = new StringTokenizer(sc.nextLine());
		
		while (token.hasMoreTokens()) {
			arrayList.add(Integer.parseInt(token.nextToken()));
		}
		
		int maxDiff = Integer.MIN_VALUE;
		int idx = -1;
		
		for (int i = 1; i < arrayList.size(); i++) {
			int diff = arrayList.get(i) - arrayList.get(i - 1);
			if (maxDiff<= diff) {
				idx = i;
				maxDiff = diff;
			}
		}
		
		
		System.out.println((2011 + idx) + " : " + (double)maxDiff + "cm");
		
	}

}
