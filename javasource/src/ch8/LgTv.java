package ch8;

public class LgTv {
	
	SamsungSpeaker speaker;
	
	public LgTv(SamsungSpeaker speaker) {
		super();
		this.speaker = speaker;
	}
	
	public void setSpeaker(SamsungSpeaker speaker) {
		this.speaker = speaker;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
