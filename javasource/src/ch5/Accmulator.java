package ch5;

public class Accmulator {

	int total = 0;
	static int grandTotal = 0;
	
	void accmulate(int amount) {
		total += amount; // 인스턴트 필드값 초기화
		grandTotal += amount; // 정적 필드값 초기화
	}
	
	
}
