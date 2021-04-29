package ch3;

public class ForEx3 {
	public static void main(String[] args) {
		// 1 ~ 10까지 숫자 중에서 짝수만 출력
		for(int i=2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		
		// 1 ~ 100까지 숫자 중에서 3의 배수만 출력
		for(int j=3; j<=100; j+=3) {
			System.out.print(j + " ");
		}
	}
}