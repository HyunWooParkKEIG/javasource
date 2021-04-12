package ch2;

public class Trapezoid {
	public static void main(String[] args) {
		// 사다리골의 넓이를 출력하시오.
				// 윗변 : 5, 아랫변 : 10, 높이 : 7
				
				int upLine = 5;
				int downLine = 10;
				int height = 7;
				
				float area = (float)(upLine + downLine) * height / 2;
				System.out.println("area = " + area);
	}
}
