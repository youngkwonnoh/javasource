package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//		try {
//			File f = new File("C:\\temp\\file1.txt");
//			// 바이트 기반 파일 읽기
//			fis = new FileInputStream(f);
//			// 바이트 기반 파일 출력
//			out = new FileOutputStream("c:\\temp\\test20.txt");
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
		
		File f = new File("C:\\temp\\file1.txt");
		try(FileInputStream fis = new FileInputStream(f);
				FileOutputStream out = new FileOutputStream("c:\\temp\\test20.txt")) {
			byte b[] = new byte[100];
			while(fis.read(b) != -1) {
				out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		
			}
	}
}
