package ch8;

public class PromotionEx {
	public static void main(String[] args) {

		
		// 자동 타입 변환 - 상속관계
		A obj1 = new B();
		A obj2 = new C();
		A obj3 = new D();
		A obj4 = new E();
		
		// Type mismatch: cannot convert from E to B
		// 관계가 없는 변수들을 사용했기 때문에 위와 같은 에러가 생긴다.
		// B obj5 = new E();
	}

}
