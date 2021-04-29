package ch12;

public class ObjectEx {
	public static void main(String[] args) {
		// Object 클래스에서는 == 과 equals 개념이 같다.
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.equals(obj2));		
	}

}
