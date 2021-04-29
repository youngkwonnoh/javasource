package ch12;

import java.util.StringTokenizer;

public class StringToken2 {
	public static void main(String[] args) {
		// StringTokenizer : 문자열 분리
		// 무언가 다른 문자열을 기준으로 분리하고 싶다면 구분하고 싶은 문자를 알려준다.
		StringTokenizer token = new StringTokenizer("Thie/is/a/test", "/");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}

}
