package ch15;

import java.io.*;

public class FileInputStreamEx5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream out = null;
		
		try {
			File f = new File("c:\\temp\\picture.jpg");
			fis = new FileInputStream(f);
			out = new FileOutputStream("c:\\temp\\picture3.jpg");
			
			byte[] b = new byte[100];
			
			while (fis.read(b) != -1) {
				out.write(b);
			}
			
//			int data = 0;
//			
//			while ((data=fis.read())!= -1) {
//				out.write(data);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fis.close();
			out.close();
		}
	}

}
