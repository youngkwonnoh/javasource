package Homework;

public class IPTV extends ColorTV {
	
	private String ip;
			
	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}

	public void printProperty() {
		System.out.println("나의 iptv는 " + ip + "주소의 ");
		super.printProperty();
	}
}
