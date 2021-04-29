package ch3;

public class ForEx2 {
	public static void main(String[] args) {
		// 1 ~ 10까지 합
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			
			sum += i;
		}
		
		System.out.printf("1~10까지의 합 : %s", sum);
	}
}