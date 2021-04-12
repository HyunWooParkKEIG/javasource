package ch4;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 40, 30},
				{40, 50, 20},
				{50, 60, 50}
		};
		
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][3] += score[i][j];
				result[5][j] += score[i][j];
				result[5][3] += score[i][j];
			}
		}
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
	}

}
