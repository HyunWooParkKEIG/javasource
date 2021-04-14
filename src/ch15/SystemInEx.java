package ch15;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx {

	public static void main(String[] args) throws IOException {
		System.out.println("====Menu====");
		
		System.out.println("1. access");
		System.out.println("2. withdraw");
		System.out.println("3. deposit");
		System.out.println("4. finish");
		System.out.print("select menu : ");
		
		InputStream in = System.in;
		
		char input = (char)in.read();
	}

}
