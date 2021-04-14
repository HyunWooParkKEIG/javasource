package ch15;
import java.io.*;

public class FileEx2 {

	public static void main(String[] args) {
		File f = new File("c:\\temp\\InputSteamEx1.java");
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println(fileName);
		System.out.println(fileName.substring(0, pos));
		System.out.println(fileName.substring(pos));
	}

}
