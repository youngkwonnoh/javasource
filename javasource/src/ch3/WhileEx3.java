package ch3;

public class WhileEx3 {
	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 3의 배수만 출력
		int i = 3;
		while(i<101) { 
			System.out.print(i + " ");
			i += 3;
		}
	}

}
