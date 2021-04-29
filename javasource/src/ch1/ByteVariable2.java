package ch1;

/* byte 타입
 * 메모리 1byte만 사용
 * 1byte = 8bit(-2^7 ~ 2^7 -1) : -128 ~ 127 표현
 * 
 */


public class ByteVariable2 {
	public static void main(String[] args) {
		// 변수 : 하나의 값을 저장할 수 있는 메모리 공간
		// 타입 변수명; 변수 선언
		// 기본타입 : boolean, byte, char, short, int, long, float, double
		
		// 변수 선언 및 할당 한번에 처리
		// byte age = 10;
		// byte maxSpeed = 20;
		byte age = 10, maxSpeed = 20;
		// 사용
		System.out.println("age = " + age);
		System.out.println("maxSpeed = " + maxSpeed);
	}

}
