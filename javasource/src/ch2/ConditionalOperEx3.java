package ch2;

public class ConditionalOperEx3 {
	public static void main(String[] args) {
		// 변수 num을 선언한 뒤 양수, 음수, 0인지 출력하시오
		// 변수에는 임의의 값을 부여한다(삼항연산식 사용)
		
		int num = 0;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		// String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		// System.out.println("결과 = " + result);
		
	}

}
