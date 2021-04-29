package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		OutputStream out = null;
//		try {
//			File f = new File("C:\\temp\\file1.txt");
//			// 바이트 기반 파일 읽기
//			fis = new FileInputStream(f);
//			// 바이트 기반 화명 출력
//			out = System.out;
//			
//			byte b[] = new byte[100];
//			while(fis.read(b) != -1) {
//				out.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try - with - resource => 자동 닫기
		File f = new File("C:\\temp\\file1.txt");
		try(FileInputStream fis =  new FileInputStream(f);
				OutputStream out = System.out) {
			byte b[] = new byte[100];
			while(fis.read(b) != -1) {
				out.write(b);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
