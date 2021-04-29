package ch1;

/* char 타입(문자) => ' ' 홑따옴표로 표현
 * 메모리 2byte만 사용
 * 2byte = 16bit(0~2의 16-1) 0~65, 535
 * 
 * 문자 vs 문자열
 * 
 */

public class CharVariable1 {

	public static void main(String[] args) {
		
		char ch1 = 'A'; // 문자
		
		// ascii 코드 : 컴퓨터 키보드(숫자, 특수문자, 영어)에 있는 문자열을 숫자로 나타낸 것
		char ch2 = 65;
		
		char ch3 = 'a', ch4 = 97;
		
		String str = "Ab"; // 문자열
		System.out.println("ch = " + ch1 + " ch2 = " + ch2);
		System.out.println("ch = " + ch3 + " ch2 = " + ch4);
		System.out.println("str = " + str);
		
	}

}
