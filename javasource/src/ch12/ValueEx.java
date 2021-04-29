package ch12;

public class ValueEx {
	public static void main(String[] args) {
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		Value value3 = value1;
		
		// 주소가 같은지 여부
		System.out.println(value1 == value2);
		
		// 주소가 같은지 여부
		// 자식 클래스 오버라이딩 => value 멤버 변수의 값이 같은지
		System.out.println(value1.equals(value2));
		// System.out.println(value1.equals(value3));
		
		System.out.println(value1.toString());
		System.out.println(value2.toString());
		
	}
	
	
	
	
}
