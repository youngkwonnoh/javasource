package ch3;

public class WhileEx2 {
	public static void main(String[] args) {
		// 1 부터 10까지 출력
		int i = 1, sum = 0;
		while(i<11) {
			sum =+ i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합 : " + sum);
	}

}
