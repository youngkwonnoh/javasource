package ch8;

public class Car {
	
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire RearLeftTire = new Tire(3, "뒤왼쪽");
	Tire RearRightTire = new Tire(4, "뒤오른쪽");
	
	String str;
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(!frontLeftTire.roll() ) {
			stop();
			return 1;
		}
		if(!frontRightTire.roll() ) {
			stop();
			return 2;
		}
		if(!RearLeftTire.roll() ) {
			stop();
			return 3;
		}
		if(!RearRightTire.roll() ) {
			stop();
			return 4;
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
