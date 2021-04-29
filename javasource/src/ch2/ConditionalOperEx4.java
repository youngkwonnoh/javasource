package ch2;

public class ConditionalOperEx4 {
	public static void main(String[] args) {
		// 문자형 변수 ch를 선언한 후 임의의 값을 넣은 후
		// ch가 영문자이거나 숫자일 때만 true가 나오는 프로그램 작성
		
		char ch = 'z';
		
		boolean result = (ch >= 97 && ch <= 122) || (ch >= 65 && ch < 90) || (ch >= 48 && ch <= 57) ? true : false;
		System.out.println(result);
		
	}

}
