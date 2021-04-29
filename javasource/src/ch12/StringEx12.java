package ch12;

public class StringEx12 {
	public static void main(String[] args) {
		String str1 = "AbZquartKgu";
		
		// 문자열 거꾸로 출력하기
		// charAt(i) : i는 배열의 위치이다. 현재 str1은 11개의 글자이므로 [0] ~ [10]
		for(int i=str1.length()-1; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		
		// str1 => StringBuilder 변경 후
		// 문자열 거꾸로 출력하는 메소드 찾이
		
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
		
		
		
	}

}
