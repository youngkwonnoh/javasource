package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		// 읽어올 파일 -> FileInputStream -> InputStreamReader -> 프로그램 처리
		
		
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "ms949");
				FileWriter fos = new FileWriter("c:\\temp\\output3.txt")) {
		
			
			int data = 0;
			while((data=fis.read()) != -1) {
				// System.out.print((char)data); 
				fos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
