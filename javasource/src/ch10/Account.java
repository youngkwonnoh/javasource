package ch10;

/* 인터페이스
 * 추상 클래스와 비슷함
 * 추상 클래스보다 추상화가 더 높다 => 추상 메소드와 상수만을 가질 수 있음
 * 다른 클래스를 작성하는데 도움을 주는 목적
 * 모든 메소드는 public abstract 이며 생략 가능
 * 모든 멤버변수는 public static final 이며 생략 가능
 * 생성자 없음
 * 
 * JDK8 인터페이스 변화
 * 디폴트 메소드 / 정적 메소드
 * 
 * JDK9 인터페이스 변화
 * private 메소드
 */
public interface Account {
	static final int SPADE = 4;
	
	// Account() {}
	
	
	abstract void test();
	void print();
	default int method2() {
		return 0;
	}
	static void method1() {
		
	}
}
