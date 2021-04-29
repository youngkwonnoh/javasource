package ch5;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.company = "기아";
		car.model = "스포티지";
		car.color = "red";
		car.maxSpeed = 100;
		
		System.out.println("제조사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색 상 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
	}

}
