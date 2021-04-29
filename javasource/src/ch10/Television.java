package ch10;
public class Television implements RemoteControl {
	
	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VLOUME) {
			this.volume = RemoteControl.MAX_VLOUME;
		} else if(volume < RemoteControl.MIN_VLOUME) {
			this.volume = RemoteControl.MIN_VLOUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
