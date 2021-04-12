package ch12;

public class MathEx3 {

	public static void main(String[] args) {
		// 1~3까지 난수를 3개 생성한 뒤 한 줄에 출력
		// 모두 같은 수가 나올 때까지 반복하고, 모든 같은 수이면 성공 출력한 후 종료
		
		// 2 1 2
		// 2 3 2
		// 1 3 3
		// 1 1 1
		// 성공
		
		int[] rand = new int[3];
		
		while (true) {
			for (int i = 0; i < rand.length; i++) {
				rand[i] = (int)(Math.random() * 3 + 1);
			}
			
			for (int r : rand) {
				System.out.print(r + " ");
			}
			
			System.out.println();
			
			if (rand[0] == rand[1] && rand[1] == rand[2]) {
				System.out.println("성공");
				break;
			}
		}
		
	}

}
