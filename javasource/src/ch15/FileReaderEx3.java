package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderEx3 {
	public static void main(String[] args) {
		// 특정 소스파일을 읽어 화면에 출력하기 => 문자를 불러올 때에는 Reader를 쓰는게 좋다
		// 행 번호를 붙여서 보여주기
		// src/ch15/FileEx1.java

		try(FileReader fr = new FileReader("src/ch15/FileEx1.java");
				BufferedReader br = new BufferedReader(fr)) {
			
			String str = null;
			int i = 1;
			while((str = br.readLine()) != null) {
				System.out.println("[" + i + "] " + str);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
