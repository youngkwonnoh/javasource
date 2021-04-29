package ch5;

public class CarEx2 {
	public static void main(String[] args) {
		
		// 기본 생성자를 이용한 객체 생성
		Car car = new Car();
		car.company = "기아";
		car.model = "스포티지";
		car.color = "red";
		car.maxSpeed = 100;
		print(car); // 주소값
	
		// 인자를 받는 생성자를 이용한 객체 생성
		Car car2 = new Car("현대");
		print(car2); // 주소값
		
		Car car3 = new Car("현대", "아반떼");
		print(car3);
		
		Car car4 = new Car("현대", "펠리세이드", 150);
		print(car4);
		
	}
	
	public static void print(Car car) {
		System.out.println("제조사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색 상 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println();
	}

}
