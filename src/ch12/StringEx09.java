package ch12;

public class StringEx09 {

	public static void main(String[] args) {
		String str1 = "bbbb";
		
		System.out.println(str1);
		System.out.println(stringCount(str1, "bb"));
	}
	
	public static int stringCount(String str, String key) {
		
		int ret = 0;
	    int flag = 0;
		
		while(true) {
			flag = str.indexOf(key, flag);
			if (flag == -1) {
				break;
			} else {
				ret++;
				flag += key.length();
			}
		}
		
		return ret;
	}
}
