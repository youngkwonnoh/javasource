package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {
	public static void main(String[] args) {
		// Reader / Writer => 문자 단위
		// InputStream / OutputStream => 바이트 단위
		FileReader reader = null;
		try {
			reader = new FileReader("c:\\temp\\file1.txt");
			int ch = 0;
			while((ch=reader.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
