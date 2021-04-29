package ch12;

public class StringEx5 {
	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";

		
		// String str2 = str1.replace("자바", "java");
		
		str1 = str1.replace("자바", "java");
		System.out.println(str1);
		
		str1 = str1.replaceFirst("java", "자바"); // 처음 만나는 한 문자열만 대체
		System.out.println(str1);
		
		String str2 = "hello";
		String str3 = "hello";
		String str4 = "Hello";
		// equals : 대소문자 구별
		// equalsIgnoreCase : 대소문자 상관 없이 문자열 구별
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str2.equalsIgnoreCase(str4));
		
		
		
		
	}

}
