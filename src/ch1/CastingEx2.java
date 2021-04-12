package ch1;

public class CastingEx2 {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		// float : 부호(1비트) + 지수(8비트) + 가수(23비트)
		
		//double num3 = num2;
		// double : 부호(1비트) + 지수(11비트) + 가슈(52비트)
		System.out.println("num3 = " + num3);
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println("result = " + result);
	}

}
