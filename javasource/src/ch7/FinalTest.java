package ch7;


// final class : 상속 금지

final class FinalTest {
	final int MAX_SIZE = 10;

	String str;
	
	// final 메소드 : 오버라이딩 금지
	final int getMAX_SIZE() {
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
}
