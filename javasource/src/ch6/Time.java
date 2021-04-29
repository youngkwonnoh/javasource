package ch6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	// Singleton 방식
//	private Time() {
//		
//	}
	
	
	// set멤버변수이름 : 멤버변수의 값을 변경 => setter 메소드 
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}
	// get멤버변수이름 : 멤버변수의 값을 읽기(호출) => getter 메소드 
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 ||  minute > 59)
			return;
		this.minute = minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSecond(int second) {
		if(second < 0 ||  second > 59)
			return;
		this.second = second;
	}
	
	public int getSecond() {
		return second;
	}
	
}
