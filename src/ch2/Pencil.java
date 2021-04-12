package ch2;

public class Pencil {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		// 학생 당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는 지 출력
		// 변수명은 임의로 설정 가능
		int totalPencil = 534;
		int numStudent = 30;
		
		int pencilPerStudent = totalPencil / numStudent;
		int leftPencil = totalPencil % numStudent;
		
		System.out.println("한 학생 당 연필 수 : " + pencilPerStudent);
		System.out.println("남은 연필 수 : " + leftPencil);
	}

}
