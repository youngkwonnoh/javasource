package ch3;
import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {
		// 1 ~ 100 사이에 임의의 숫자 하나 생성
		// 생성된 숫자를 사용자가 맞추는 형태
		// 생성된 숫자보다 사용자의 입력값이 더 크면 '더 작은 수 입력하기'라는 메세지 출력
		// 반대의 경우에는 '더 큰 수 입력하기' 메세지 출력
		
		int input = 0;
		int answer = (int)(Math.random() * 100) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1 ~ 100 사이의 정수 입력");
			input = sc.nextInt();
			
			if(answer < input) {
				System.out.println("더 작은 수 입력");
			} else {
				System.out.println("더 큰 수 입력");
			}
		} while(input != answer);
		
		System.out.println("정답");

	}

}
