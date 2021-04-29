package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx {
	public static void main(String[] args) {
		
		// FileNotFoundException => Checked Exception
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // 예외 여부랑 상관없이 무조건 수행 - 자원 해제
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} // IOEwception
		}
		
		
	}

}
