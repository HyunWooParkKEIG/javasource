package ch2;

public class Result300 {
	public static void main(String[] args) {
		int value = 356;
		
		// 출력결과가 300이 나올 수 있도록 알맞은 신술 기호를 써서 출력
		int result = value - value % 100;
		
		System.out.println("result = " + result);
	}

}
