package ch12;

public class StringEx6 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// substring(시작위치, 끝나는 위치)
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7));
		
		
		// int => String 방법 : 10+""
		// valueOf
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf('c'));
		
		
		// join : 지정해준 첫 값이 뒤 값들 사이사이에 들어간다.
		String str1 = String.join("-", "java", "is", "cool"); // java-is-cool
		System.out.println(str1);
		
		String str2 = "aaa";
		String str3 = "bbb";
		String str4 = "ccc";
		
		// compareTo() : 사전 순서로 비교		
		System.out.println(str2.compareTo(str3));  // -1
		System.out.println(str3.compareTo(str2));  // 1
		
		System.out.println(str2.compareTo(str4));  // -2
		
		// toUpperCase()
		String str5 = "abcdefg";
		System.out.println(str5.toUpperCase());
		
		// toLowerCase()
		String str6 = "ABCDEFG";
		System.out.println(str6.toLowerCase());
		
		// trim() : 좌, 우공백 제거
		String str7 = "      ABC      deFG      ";
		System.out.println(str7);
		System.out.println(str7.trim());
	}
}
