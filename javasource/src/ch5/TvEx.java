package ch5;

public class TvEx {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		
		tv.color = "red";
		tv.power = true;
		tv.channel = 7;
		
		tv.channelUp();
		
		// 확인
		System.out.println("색상 : " + tv.color);
		System.out.println("전원 : " + tv.power);
		System.out.println("채널 : " + tv.channel);
		
	}

}
