package ch5;

// 전체 프로그램에서 단 하나의 객체만 생성되도록 보장하는 방식
// 
public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		// 외부에서 new 연산자로 생성자 호출 불가
	}
	
	static Singleton getInstacne() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
