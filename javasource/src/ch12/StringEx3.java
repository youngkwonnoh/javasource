package ch12;

public class StringEx3 {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// indexOf() : 매개변수로 주어진 문자열이 시작되는 인덱스 리턴
		// lastIndexOf() : 매개변수로 주어진 문자열이 뒤에서부터 확인하며 인덱스 리턴
		System.out.println(str1.indexOf("자바")); // 0 : 문자열을 찾으면 문자열의 시작위치를 반환
		System.out.println(str1.indexOf("베이직")); // -1 : 문자열을 못 찾을 때
		System.out.println(str1.indexOf("그")); // 5
		
		
		String str2 = "Hello";
		System.out.println("o 문자 위치 : " + str2.indexOf('o'));
		System.out.println("el 문자 위치 : " + str2.indexOf("el", 2));
		
		String str3 = "HelloHelloHello World";
		System.out.println("l 문자 위치 : " + str3.indexOf('l')); // 2
		System.out.println("l 문자 위치 : " + str3.lastIndexOf('l')); // 19
		
		
		
		
		if(str1.indexOf("프") >= 0) {
			System.out.println("들어있음");
		} else {
			System.out.println("없음");
		}
		
	}
}
