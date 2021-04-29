package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class PerformanceEx1 {
	public static void main(String[] args) {
		// FileInputStream VS BufferedInputStream + FileInputStream
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")) {
			
			long start = System.currentTimeMillis();
			while(fis.read() != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream 사용 시 : " + (end - start));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			long start = System.currentTimeMillis();
			while(bis.read() != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream 사용 시 : " + (end - start));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
