package ch2;

public class ConditionalOperatorEx4 {
	public static void main(String[] args) {
		char ch = '6';
		// 65~90 97~122 48~57
		boolean flag = ch < 48? false : (ch < 58? true : (ch < 65? false : (ch < 91? true : (ch < 97? false : (ch < 123? true : false)))));
		System.out.println(flag);
	}
	

}
