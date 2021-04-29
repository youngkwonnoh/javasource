package ch12;

import java.util.StringTokenizer;

public class StringToken4 {
	public static void main(String[] args) {
		// 여러 문자가 섞여있으면 다 적어주면 된다.
		String expression = "x=100*(200+300)/2";
		
		StringTokenizer token = new StringTokenizer(expression, "=*+/()");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}

}
