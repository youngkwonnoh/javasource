package ch6;

public class Car {
	private int speed;
	private boolean stop;
	
	
	
	public double getSpeed() {
		return speed * 1.6;
	}
	public void setSpeed(int speed) {
		if(speed < 0)
			return;
		this.speed = speed;
	}
	
	// boolean 은 true, false 개념이므로 getStop이 아닌 isStop을 쓴다.
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
