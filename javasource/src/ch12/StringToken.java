package ch12;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		// StringTokenizer : 문자열 분리
		StringTokenizer token = new StringTokenizer("This is a test");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}

}
