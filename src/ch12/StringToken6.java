package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {

	public static void main(String[] args) {
		//사용자로부터 문자열을 입력 받아 공백으로 분리된 어절이 몇 개인지 출력
		//exit가 들어오면 프로그램 종료
		
		// 예시) 오늘은 금요일 입니다. => 3
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			StringTokenizer token = new StringTokenizer(str);
			int cnt = 0;
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(token.countTokens());
			}	
		}
		
		
	}

}
