package ch5;

public class CalculatorEx {
	public static void main(String[] args) {
		
		// 객체 생성 => 기본 생성자 호출
		Calculator cal = new Calculator();
		
		// 메소드 호풀
		
		// 메소드 타입이 void 일 때는 호출만 하면 끝
		cal.powerOn();

		// 메소드 타입이 return이면 
		// 1.sysout에 넣어준다.
		// System.out.println(cal.plus(35, 45));
		
		
		// 2. 타입과 동일한 변수명과 변수를 지정하여 값을 넣고 출력한다.
		int result = cal.plus(35, 45);
		System.out.println(result);
		
		double result1 = cal.divide(10, 4);
		System.out.println(result1);
		
	}

}
