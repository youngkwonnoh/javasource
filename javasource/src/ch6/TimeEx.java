package ch6;

public class TimeEx {
	public static void main(String[] args) {
		Time t = new Time();
		// t.hour = 25;
		t.setHour(12);
		t.setMinute(25);
		t.setSecond(51);
		
		System.out.printf("íėŽėę° %d:%d:%d\n", t.getHour(), t.getMinute(), t.getSecond());
	}

}
