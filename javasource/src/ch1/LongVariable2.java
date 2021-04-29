package ch1;

/* long 타입
 * 메모리 8byte만 사용
 * 8byte = 64bit(-2^63 ~ 2^63 -1)
 */
public class LongVariable2 {
	public static void main(String[] args) {
		long val1 = 123456789; // l,L 옵션
		
		// int 타입의 저장 범위를 넘어서는 정수 값에는 L을 반드시 붙여야 한다.
		// long val2 = 1000000000000; 컴파일 에러

		long val2 = 1000000000000L;
		long val3 = 20L;
		
		
		System.out.println("val1 = " + val1);
	}

}
