package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {
	public static void main(String[] args) {
		
//		// 키보드로 문자열을 읽어 "/"문자로 분리하는 프로그램 작성
//		StringTokenizer token = new StringTokenizer("아빠/엄마/수연/연수/수희", "/수연연수수희");
//		
//		while(token.hasMoreElements()) {
//			System.out.println(token.nextToken());
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요. 구분자는 / 입니다");
		StringTokenizer token = new StringTokenizer("아빠\n엄마/수연연수수희", "/");
		System.out.println(token.nextToken());
	}

}
