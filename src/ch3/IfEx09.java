package ch3;

import java.util.Scanner;

public class IfEx09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double timeWage = 5000.0;
		double totalWage = 0;
		
		int time = sc.nextInt();
		
		if(time > 8) {
			double plusWage = timeWage * 1.5;
			int exTime = time = 8;
			
			totalWage = plusWage * exTime + timeWage * 8;
		} else {
			totalWage = time * timeWage;
		}
		
		System.out.println("money : " + totalWage);
	}

}
