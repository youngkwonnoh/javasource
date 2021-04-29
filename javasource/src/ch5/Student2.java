package ch5;

/* 클래스
 * 클래스명의 시작은 숫자가 올 수 없다.
 * $,_ 외의 특수문자는 사용할 수 없다.
 * 자바 키워드는 사용할 수 없다.
 * 관례적으로 대문자를 사용한다.
 * 서로 다른 단어가 혼합된 이름을 사용한다면 각 단어의 첫 머리글자는 대문자로 작성한다.
 */

public class Student2 {
	// 속성 - 학번, 이름, 주소, 핸드폰...... => 필드(멤버변수, 프로퍼티)
	String id; // 학번
	String name; // 이름
	String addr; // 주소
	String mobile; // 핸드폰번호
	
	// 생성자 - 클래스명 동일
	// 개발자가 명시적으로 생성자를 선언하지 않으면 자동으로 컴파일러가 생성해 줌.
	// public Student2() {}; // 기본 생성자.(Default Constructor)
	
	Student2(String id, String name, String addr, String mobile) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.mobile = mobile;
	}
	
	
	
	
	// 기능 - 핸드폰 번호 변경, 주소 변경 => 메소드
	void changeMobile(String change) {
		this.mobile = change;
	}
	
	void changeAddr(String addr) {
		this.addr = addr;
	}
	
}
