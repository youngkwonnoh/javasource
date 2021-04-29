package ch7;

public class Cellphone2 {
	// 속성 : 모델, 색상
	String model;
	String color;
	
//	public Cellphone2() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	
	// 생성자
	public Cellphone2(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
