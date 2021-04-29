package ch7;

public class DmbCellPhone3 extends Cellphone2 {
	int channel;
	
	// 기본생성자 : public DmbCellPhone3() {}

	public DmbCellPhone3(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경");
		
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
