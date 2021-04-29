package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {
	public static void main(String[] args) {
		
		// 사용자로부터 문자열을 입력 받아 공백으로 분리된 어절이 몇 개인지 출력하기
		// exit가 들어오면 프로그램 종료
		
//		System.out.println("문장을 입력하세요");
//		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		StringTokenizer str1 = new StringTokenizer(str);
//		
//		int sum = 0;
//		while(str1.hasMoreElements()) {
//			if(str1.nextToken().equals("exit")) {
//				break;
//			} else {
//				sum++;
//			}
//		}
//		System.out.println(sum);
//	}
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(true) {
			System.out.println("문자를 입력하세요");
			input = sc.nextLine();
			if(!input.equals("exit")) {
				
				StringTokenizer token = new StringTokenizer(input);
				System.out.println("분리된 어절 수 : " + token.countTokens());
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		
	}

}
