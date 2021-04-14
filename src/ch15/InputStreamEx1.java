package ch15;

import java.io.*;

public class InputStreamEx1 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		int input = 0;
		
		byte[] b = new byte[10];
		
		try {
			while (in.read(b)!= -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
