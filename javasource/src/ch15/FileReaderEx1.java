package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx1 {
	public static void main(String[] args) {
		// Reader / Writer => 문자 단위
		// InputStream / OutputStream => 바이트 단위
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("c:\\temp\\file1.txt");
			// 파일 불러오기 중 한글이 깨질 시 윈도우즈에서 한글을 표현하는 형태인 ms949를 넣어준다.
			// reader = new FileReader("c:\\temp\\file1.txt", Charset.forName("ms949"));
			
			writer = new FileWriter("c:\\temp\\output2.txt");
//			int ch = 0;
//			while((ch=reader.read()) != -1) {
//				System.out.print(ch);
//			}
			
			char[] ch = new char[1024];
			while(reader.read(ch) != -1) {
				writer.write(ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
