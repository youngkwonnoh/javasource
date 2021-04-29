package ch12;

import java.util.StringTokenizer;

public class StringToken3 {
	public static void main(String[] args) {
		// 여러 문자가 섞여있으면 다 적어주면 된다.
		String str = "name=kitae&addr=seoul&age=21";
		
		StringTokenizer token = new StringTokenizer(str, "&=");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}

}
