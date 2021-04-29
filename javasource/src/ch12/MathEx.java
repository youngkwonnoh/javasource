package ch12;

public class MathEx {
	public static void main(String[] args) {
		double val = 90.7552;
		
		// 반올림
		System.out.println("round : " + Math.round(val));
		// 올림
		System.out.println("ceil : " + Math.ceil(1.1));
		// 버림
		System.out.println("floor : " + Math.floor(1.5));
		
		System.out.println("round : " + Math.round(-1.5));
		System.out.println("ceil : " + Math.ceil(-1.5));
		System.out.println("floor : " + Math.floor(-1.5));
		
	}

}
