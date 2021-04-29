package ch7;

public class TV {
	//속성(필드,멤버변수,프로퍼티)
	//색상(red), 전원상태(on/off), 채널(11,6..)
	String color;
	boolean power;
	int channel;
	
	
	//동작(메소드)
	//전원을 켠다/끈다   채널변경
	void power() {
		power=!power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}