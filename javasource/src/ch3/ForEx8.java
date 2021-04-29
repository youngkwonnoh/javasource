package ch3;

public class ForEx8 {
	public static void main(String[] args) {
		// 1 ~ 100까지 정수 중 3의 배수만을 더한다.(단 9의 배수는 안 더함)
		
		int sum3 = 0;
		int sum9 = 0;
		
		for(int i=0; i<=100; i+=3) {
			sum3 += i;
		}
		for(int j=0; j<=100; j+=9) {
				sum9 += j;
		}
		System.out.printf("결과 : %d", sum3 - sum9);
		
	}
}

//package ch3;
//
//public class ForEx8 {
//	public static void main(String[] args) {
//		// 1 ~ 100까지 정수 중 3의 배수만을 더한다.(단 9의 배수는 안 더함)
//		int sum = 0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i%3 == 0 && i%9 != 0) {
//			sum += i;
//			}
//		}
//		System.out.println("3의 배수(9의 배수 제외) 총합 : " + sum);
//	}
//}