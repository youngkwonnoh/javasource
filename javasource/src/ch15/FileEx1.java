package ch15;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		
		// \t, \n, 폴더 구분 : \\, /
		File f1 = new File("c:\\temp\\test1.txt");
		File f2 = new File("c:\\temp", "test1.txt");
		File parent = new File("c:\\temp");
		// public File(File parent, String child)
		File f3 = new File(parent, "test1.txt");
		
	}
}
