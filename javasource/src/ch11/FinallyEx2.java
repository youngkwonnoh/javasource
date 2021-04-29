package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx2 {
	public static void main(String[] args) {
		
		// 자동으로 자원 닫기
		
		try (FileInputStream fis = new FileInputStream("input.txt");
				FileOutputStream fos = new FileOutputStream("");){
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		} finally { // 예외 여부랑 상관없이 무조건 수행 - 자원 해제
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} // IOEwception
//		}
		
		
	}

}
