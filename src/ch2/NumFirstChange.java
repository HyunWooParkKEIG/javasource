package ch2;

public class NumFirstChange {
	public static void main(String[] args) {
		int num = 777;
		
		// num의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
		
		int result = num - num % 10 + 1;
		
		System.out.println("result = " + result);
	}

}
