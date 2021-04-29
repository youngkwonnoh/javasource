package ch5;

public class PhysicalInfo {
	// 속성 : 이름, 나이, 키, 몸무게
	
	String name;
	int age;
	float height;
	float weight;
	
	// 기능 : 나이를 변경한다. / 나이와 키를 변경한다. / 나이, 키, 몸무게를 변경한다.
	// 메소드 오버로딩 : 하나의 클래스 내에 같은 이름의 메소드를 여러 개 선언
	// 				 매개변수의 타입, 개수, 순서 중 하나가 달라야 한다.
	void update(int age) {
		this.age = age;
		System.out.println();
	}
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
//	void update(int age, float weight) {
//		this.age = age;
//		this.weight = weight;
//	}
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
}
