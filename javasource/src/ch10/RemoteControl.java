package ch10;

public interface RemoteControl {
	// 상수 선언
	public int MAX_VLOUME = 10;
	public int MIN_VLOUME = 10;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	static void changeBattert() {
		System.out.println("건전지 교체");
	}
	
	
}
