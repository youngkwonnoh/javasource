package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		// 읽어올 파일 => FileInputStream => 버퍼
		
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\file1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\output4.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
