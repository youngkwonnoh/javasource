package ch5;

public class MathEx {
	public static void main(String[] args) {
		// 인스턴스 변수나 메소드는 반드시 객체 생성 후 호출
		MyMath math = new MyMath();
		math.a = 100;
		math.b = 100;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());
		
		
		// 클래스(정적) 메소드 호출
		System.out.println(MyMath.add(300, 500));
		System.out.println(MyMath.subtract(300, 500));
		System.out.println(MyMath.multiply(300, 500));
		System.out.println(MyMath.divide(300, 500));
	}

}
