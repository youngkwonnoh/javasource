package ch8;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		// 부모의 참조 변수로 접근할 수 있는 범위는 Parent 클래스가 가지고 있는 메소드로 제한된다.
		// 단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 실행
		
		parent.method1(); // 부모꺼
		parent.method2(); // 내꺼
		// child.method3(); // The method method3() is undefined for the type Parent

		
		// 강제 형변환
		Child child = (Child) parent;
		child.method3();
		
		// ClassCastException
		// Parent p1 = new Parent();
		// child = (Child) p1;
		
	}

}
