package ch3;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		
		// System.out : 화면
		// System.in : 키보드
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		// nextLine() : 값을 읽어올 때 \n 기준으로 읽어온다.
		// String 사용.
		// String str = sc.nextLine();
		String str = sc.next();
		// next() : 값을 읽어올 때 공백을 기준으로 읽어온다.
		// String 사용.
		System.out.println(str);
	}

}
