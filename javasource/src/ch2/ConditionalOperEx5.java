package ch2;

public class ConditionalOperEx5 {
	public static void main(String[] args) {
		// 임의의 정수 변수를 선언한 후 그 숫자가 홀수인지 짝수인지 출력하기
		int num = 25;
		String result = num %2 == 0? "짝수" : "홀수";
		System.out.println(result);
	}

}
