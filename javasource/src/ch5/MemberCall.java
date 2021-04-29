package ch5;

public class MemberCall {
	// 인스턴스 변수
	int iv = 10;
	// 클래스 변수
	static int cv = 20;
	
	// 인스턴스 변수
	int iv2 = cv;
	// 클래스 변수
	// static int cv2 = iv; (불가능)
	
	
//	MemberCall call = new MemberCall();
//	call.iv
	
//	(위의 코드를 간단하게 작성한 것이 아래 코드이다.)
	
	static int cv2 = new MemberCall().iv;
	
	// 클래스 메소드
	static void statciMethod1() {
		System.out.println(cv);
		// iv는 인스턴스 변수라 못불러 온다. 아래 코드는 빨간줄
		// 같은 변수끼리만 불러올 수 있다.
		// System.out.println(iv); 
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod1() {
		staticMethod1();
		// instanceMethod1();
	}
	
	
	static void staticMethod2() {
		staticMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}
