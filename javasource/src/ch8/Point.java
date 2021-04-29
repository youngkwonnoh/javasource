package ch8;

public class Point {
	int x; // x 좌표
	int y; // y 좌표

	public Point() {
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")";
	}

}
