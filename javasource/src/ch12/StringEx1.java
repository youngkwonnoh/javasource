package ch12;

public class StringEx1 {
	public static void main(String[] args) {
		
	// 문자열 객체 생성
	String str = "Hello";
	
	
	// str.charAt() : 특정위치에 있는 위치 값 가져오기
	System.out.println(str.charAt(0)); // H
	char ch1 = str.charAt(1); // e
	System.out.println(ch1);
	
	System.out.println("문자열 길이 : " + str.length()); // 5
	
	for(int i=0; i<str.length(); i++) {
		System.out.println(str.charAt(i));
	}
	
	char ch[] = {'H', 'e', 'l', 'l', 'o'};
	String str2 = new String(ch);

	System.out.println(str);
	System.out.println(str2);
	
	
	}
	
}
