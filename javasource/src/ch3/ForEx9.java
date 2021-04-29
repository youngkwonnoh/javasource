package ch3;

public class ForEx9 {
	public static void main(String[] args) {
		// 1 ~ 100까지 정수 중에서 3의 배수와 5의 배수 총합 구하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수와 5의 배수 총합 : " + sum);
	}

}
