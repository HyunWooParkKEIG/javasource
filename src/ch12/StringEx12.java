package ch12;

public class StringEx12 {

	public static void main(String[] args) {
		String str1 = "ABZquartKgu";
		
		for (int i = str1.length(); i > 0; i-- ) {
			System.out.print(str1.charAt(i - 1));
		}
		System.out.println();
		
		StringBuilder sb = new StringBuilder(str1);
		
		System.out.println(sb.reverse());
		
	}

}
