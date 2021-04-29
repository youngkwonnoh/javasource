package ch12;

public class PersonEx {
	public static void main(String[] args) {
		
		Person person1 = new Person("123", "홍길동");
		Person person2 = new Person("123", "홍길동");
		Person person3 = new Person("123", "맹구");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		
		
		// getClass() : 현재 실행되고 있는 클래스의 정보를 가져옴
		System.out.println(person1.getClass());
		
		// getClass().getName() : 현재 실행되고 있는 클래스명 가져옴
		System.out.println(person1.getClass().getName());
		
		// toString() : 주소값 출력
		// 멤버 변수의 값을 출력하는 용도
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		
		
	}

}
