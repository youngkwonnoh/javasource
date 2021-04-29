package ch5;

public class Car {
	// 속성(필드) : 제조사 / 모델 / 색상 / 최고속도
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// 기본 생성자
//	public Car() {}
//	// 생성자는 여러 개 올 수 있다.(생성자 오버로딩)
//	public Car(String company) {
//		this.company = company;
//	}
//	public Car(String company, String model) {
//		this.company = company;
//		this.model = model;
//	}
//	public Car(String company, String model, int maxSpeed) {
//	this.company = company;
//	this.model = model;
//	this.maxSpeed = maxSpeed;
//	}
	
	
	
	
	public Car() {
		super();
	}
	public Car(String company) {
		super();
		this.company = company;
	}
	public Car(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}


	public Car(String company, String model, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	// 기능(동작) : 전진, 후진
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
}
