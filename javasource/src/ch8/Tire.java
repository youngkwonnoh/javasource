package ch8;

public class Tire {
	// 속성 : 최대 회전수, 누적 회전수, 타이어 위치
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}


	public boolean roll() {
		++ accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
