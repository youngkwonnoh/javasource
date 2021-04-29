package ch10;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl remote = new Television();
		remote.turnOn();
		remote.turnOff();
		
		remote = new Audio();
		remote.turnOn();
		remote.setVolume(12);
		remote.turnOff();
		
		// 익명구현
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다");				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 조절 " + volume);
			}
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}

}
