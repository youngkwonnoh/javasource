package ch5;

public class TvEx2 {
	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();
		tv.color = "red";
		tv.power = true;
		tv.channel = 7;
		tv.channelUp();
		print(tv);
		
		// 색상 : 흰색
		TV tv2 = new TV("white");
		print(tv2);
		
		TV tv3 = new TV("Black", true);
		print(tv3);
		
		TV tv4 = new TV("red", true, 5);
		print(tv4);
		
	}
	
	public static void print(TV tv) {
	// 확인
	System.out.println("색상 : " + tv.color);
	System.out.println("전원 : " + tv.power);
	System.out.println("채널 : " + tv.channel);
	System.out.println();
	}
}
