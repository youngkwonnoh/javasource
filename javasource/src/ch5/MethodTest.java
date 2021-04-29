package ch5;

/* 메소드
 * 리턴타입 메소드명(매개변수){}
 * 
 * 메소드명은 숫자로 시작하면 안됨.
 * $,_만 가능
 * 소문자로 시작(관례)
 * 서로 다른 단어가 혼합된 상태이면 뒤이어 오는 단어의 첫머리 글자는 대문자 사용.
 * 
 */

public class MethodTest {
	
	// 리턴타입 true, false / 메소드명은 isRedirect 
	// 매개변수 없음
	boolean isRedirect() {
		return true;
	}
	
	
	// 정수 값 리턴 / 두 개의 정수 타입의 매개변수
	// 전달받은 매개변수의 합 리턴 / 메소드 이름 : sum
	int sum(int a, int b) {
		return a + b;
	}
	
	// 정수 리턴(long) / 두 개의 정수 타입의 매개변수,
	// 전달받은 매개변수의 곱 리턴 / 메소드 이름 : multiply
	long multiply(int a, int b) {
		return a * b;
	}

	// 문자 리턴, 매개변수 없음, method1
	// 문자 A 리턴
	char method1() {
		return 'A';
	}
	
	// 실수 리턴(double), 두 개의 실수 타입 매개변수
	// divide, 전달받은 매개변수의 나누기 리턴
	double divide(double a, double b) {
		return a / b;
	}
	
	// 정수형 배열 리턴, 하나의 정수 타입의 배열 매개변수, getArr
	// 매개변수 받은 것 리턴
	int[] getArr(int[] arr) {
		return arr;
	}
	
	// 문자열 리턴, 문자열 매개변수 하나, getName
	// 매개변수 받은 것 리턴
	String getName(String name) {
		return name;
	}	
	
	void print() {
		return;
	}
	
}
