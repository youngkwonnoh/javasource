package ch7;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
