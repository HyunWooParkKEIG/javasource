package ch15;

import java.io.*;

public class FileInputStreamEx3 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//		
//		try {
//			File f = new File("c:\\temp\\file1.txt");
//			fis = new FileInputStream(f);
//			out = new FileOutputStream("c:\\temp\\test20.txt");
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
		try (FileInputStream fis= new FileInputStream(f);
				FileOutputStream out = new FileOutputStream("c:\\temp\\test20.txt");) {
			
			byte[] b = new byte[100];
			
			while (fis.read(b) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
