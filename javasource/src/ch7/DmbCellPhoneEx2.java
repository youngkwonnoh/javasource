package ch7;

public class DmbCellPhoneEx2 {
	public static void main(String[] args) {
		DmbCellPhone2 dmb = new DmbCellPhone2("자바폰", "black", 7);
		// new DmbCellPhone2
		// 자식의 생성자 호출
		// super(); 부모객체가 생성됨
		// 멤버 변수의 초기화
		// 자식 객체 생성됨
		
		dmb.powerOn();
		dmb.turnOnDmb();
		dmb.changeChannelDmb(8);
		dmb.turnOffDmb();
		dmb.bell();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 고객님");
		dmb.hangUp();
	}

}
