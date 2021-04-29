package ch5;

public class Triangle {
	// 속성 : 밑변, 높이
	int baseLine;
	int height;
	
	Triangle(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;
	}
	
	// 기능 : 면적 구하기
	
	// 리턴타입 메소드명(매개변수) {
	// 실행할 구문;
	// 실행할 구문;
	// }
	
	double getArea() {
		return (baseLine * height) / 2; 
	}
}
