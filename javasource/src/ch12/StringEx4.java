package ch12;

public class StringEx4 {
	public static void main(String[] args) {
	
		String str1 = "abcdefg";
		
		// contains : 문자열을 가지고 있는지 true, false로 확인
		System.out.println(str1.contains("ab"));
	
		String str2 = "자바 프로그래밍";
		// 프
//		if(str2.contains("프")) {
//			System.out.println("들어있음");
//		} else {
//			System.out.println("없음");
//		}
		
		System.out.println(str2.contains("프")?"들어있음":"없음");
	
	
	}
}
