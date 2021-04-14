package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx1 {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		try {
			//reader = new FileReader("c:\\temp\\file1.txt");
			reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("ms949"));
			writer = new FileWriter("c:\\temp\\file1-copy.txt");
			
//			int ch = 0;
//			
//			while ((ch = reader.read())!= -1) {
//				writer.write(ch);
//			}
			
			char[] ch = new char[1024];
			while(reader.read(ch) != -1) {
				System.out.println(ch);
				writer.write(ch);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
