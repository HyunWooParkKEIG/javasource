package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		OutputStream out = null;
		
		try {
			File f = new File("c:\\temp\\file1.txt");
			fis = new FileInputStream(f);
			out = System.out;
			
			int data = 0;
			
			while ((data=fis.read())!= -1) {
				out.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fis.close();
			out.close();
		}
	}

}
