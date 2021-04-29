package ch15;

import java.io.FileWriter;

public class FileWriterEx1 {
	public static void main(String[] args) {
		// FileWriter("c:\\temp\\output1.txt", true) 
		// true를 쓰면 파일이 존재할 시 파일에 있는 내용 뒤에 내용을 이어서 쓴다.
		// true 없으면 기본인 false로 되어있으며 파일에 덮어쓴다.
		try(FileWriter writer = new FileWriter("c:\\temp\\output1.txt")) {
			// \r\n : 엔터
			writer.write("FileWriter는 한글로 된\r\n");
			writer.write("문자열을 바로 출력 가능\r\n");
			writer.write("Writer 클래스는 문자 단위의\r\n");
			writer.write("출력만 가능");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
