package ch7;

public class ChildEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1(); // 부모꺼
		child.method2(); // 내꺼
		child.method3(); // 내꺼
		
	}

}
