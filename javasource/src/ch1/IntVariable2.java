package ch1;

/* int 타입
 * 메모리 4byte만 사용
 * 4byte = 32bit(-2^31 ~ 2^31 -1) : -2,147,483,648 ~ 2,147,483,647 표현
 * 
 * 
 * byte, char, short, int, long : 정수형 데이터 담을 때 사용
 */

public class IntVariable2 {
	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 012; // 8진수
		int var3 = 0xA; // 16진수
		System.out.println("변수값 : " + var1);
		System.out.println("변수값 : " + var2);
		System.out.println("변수값 : " + var3);
	}

}