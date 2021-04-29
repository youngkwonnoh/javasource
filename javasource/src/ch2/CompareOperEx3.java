package ch2;

public class CompareOperEx3 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// str1과 str2는 같은 객체의 번지 값을 가져서 true가 나옴.
		// str1과 str3은 다른 객체의 번지 값
		
		// 문자열 비교 equals
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		// equals를 통해 객체의 문자열만 비교를 한다.
		
		
	}

}
