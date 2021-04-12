package ch12;

public class StringEx10 {

	public static void main(String[] args) {
		String str1 = "Hello World";
		
		StringBuffer buffer = new StringBuffer(str1);
		
		StringBuilder builder = new StringBuilder(str1);
		
		buffer.append(" 반갑습니다!");
		builder.append(" 반갑습니다!");
		
		System.out.println(str1);
		System.out.println(buffer);
		System.out.println(builder);
	}

}
