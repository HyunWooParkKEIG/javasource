package ch2;

public class ConditionalOperatorEx3 {
	public static void main(String[] args) {
		int num = 12;
		
		String result = (num > 0)? "양수" : (num == 0)? "0" : "음수";
		System.out.println(result);
		
		
	}

}
