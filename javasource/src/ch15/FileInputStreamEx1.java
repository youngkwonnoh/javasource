package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		OutputStream out = null;
//		try {
//			File f = new File("C:\\temp\\file1.txt");
//			// 바이트 기반 파일 읽기
//			fis = new FileInputStream(f);
//			// 바이트 기반 화면 출력
//			out = System.out;
//			
//			int data = 0;
//			while((data=fis.read()) != -1) {
//				out.write(data);
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
		// The resource type File does not implement java.lang.AutoCloseable
		File f = new File("C:\\temp\\file1.txt");
		try(FileInputStream fis = new FileInputStream(f); 
				OutputStream out = System.out) {
			int data = 0;
			while((data=fis.read()) != -1) {
				out.write(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
