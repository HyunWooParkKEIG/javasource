package ch3;

public class ifEx07 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 20) + 81;
		System.out.println("score : " + num);
		
		if(num >= 90) {
			if (num >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if(num >= 80) {
			if (num >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if(num >= 70) {
			if (num >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else if(num >= 60) {
			if (num >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
	}
}
