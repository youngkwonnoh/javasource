package Homework;

public abstract class OddDetector {
	
	private int n;
	
	public OddDetector(int n) {
		this.n = n;
	}
	
	protected int getN() {
		return n;
	}
	
	public abstract boolean isOdd(); // 홀수이면 리턴
	
	
	
	
}
