package ch15;

import java.io.*;

public class FileInputStreamEx6 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//		
//		try {
//			File f = new File("c:\\temp\\Rolling.mp3");
//			fis = new FileInputStream(f);
//			out = new FileOutputStream("c:\\temp\\Rolling3.mp3");
//			
//			byte[] b = new byte[100];
//			
//			while (fis.read(b) != -1) {
//				out.write(b);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			fis.close();
//			out.close();
//		}
		File f = new File("c:\\temp\\file1.txt");
		try (FileInputStream fis = new FileInputStream(f);
				OutputStream out = System.out) {
			
			byte[] b = new byte[100];
			
			while (fis.read(b) != -1) {
				out.write(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
