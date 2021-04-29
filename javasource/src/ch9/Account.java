package ch9;

/* 추상 클래스(abstract class)
 * 클래스 : 설계도
 * 추상 클래스 : 미완성 설계도(추상 메소드 포함)
 * 상속을 받는 하위 클래스에서 반드시 추상 메소드는 구현을 해야함
 * 객체 생성 불가 => 생성자는 존재
 */

public abstract class Account {
	
	String name;
	
	public Account() {
		System.out.println("Account 기본 생성자");
	}
	
	
	// 추상 메소드(구현 부분이 없음)
	abstract void method1();
	void method2() {} // 일반 메소드
	
	
	
}
