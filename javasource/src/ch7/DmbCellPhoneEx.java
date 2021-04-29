package ch7;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone();
		
		dmb.model = "자바폰";
		dmb.color = "black";
		dmb.channel = 7;
		
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
