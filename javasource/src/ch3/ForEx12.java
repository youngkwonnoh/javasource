package ch3;

public class ForEx12 {
	public static void main(String[] args) {
		// 정수 12345를 선언하고 각 자릿수를 더한 결과를 출력하기
		int num = 12345;
		int result = 0;
		// num의 값을 12345로 지정해줬기 때문에 초기화식이 필요없다.
		// num/10도 아래에서 주어졌다
		// 그래서 for(num=12345; num!=0; num/10)이 아닌
		// for(; num!=0;)를 사용.
		for(; num!=0;) {
			result += num % 10;
			num = num / 10;
		}
		System.out.println(result);
	}

}

//package ch3;
//
//public class ForEx12 {
//	public static void main(String[] args) {
//		int result = 0;
//
//		for(int num=12345; num!=0; num/=10) {
//			result += num % 10;
//		}
//		System.out.println(result);
//	}
//
//}