package ch15;

import java.io.*;

public class FileInputStreamEx4 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//		
//		try {
//			File f = new File("c:\\temp\\Rolling.mp3");
//			fis = new FileInputStream(f);
//			out = new FileOutputStream("c:\\temp\\Rolling2.mp3");
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
		
		File f = new File("c:\\temp\\Rolling.mp3");
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream out = new FileOutputStream("c:\\temp\\Rolling3.mp3");){
			
			byte[] b = new byte[100];
			
			while (fis.read(b) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
