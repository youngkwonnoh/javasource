package ch15;

import java.io.File;
import java.io.IOException;

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\temp\\InputStreamEx1.java");
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일명 : " + fileName);
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
		System.out.println("확장자 : " + fileName.substring(pos + 1));
		
		System.out.println("경로를 포함한 파일명 : " + f.getPath());
		System.out.println("파일의 절대경로 : " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 : " + f.getParent());
		System.out.println();
		
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		System.out.println("user.dir = " + System.getProperty("user.dir"));
		
		
		
	}

}
