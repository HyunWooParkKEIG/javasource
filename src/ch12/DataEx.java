package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy");
		System.out.println(sdf.format(date));
	}

}
