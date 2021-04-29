package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {
	public static void main(String[] args) {
		// 읽어올 파일 => FileInputStream => 버퍼
		
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\picture.jpg"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\picture2.jpg"))) {
			
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
