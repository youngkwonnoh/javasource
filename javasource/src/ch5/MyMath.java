package ch5;

public class MyMath {
	// 인스턴트 변수
	long a, b;
	
	// 인스턴스 메소드
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	// 정적 필드(클래스 변수)
	// 정적 메소드(클래스 메소드
	static long add(long c, long d) {
		return c + d;
	}
	static long subtract(long c, long d) {
		return c - d;
	}
	static long multiply(long c, long d) {
		return c * d;
	}
	static double divide(long c, long d) {
		return c / d;
	}

}
