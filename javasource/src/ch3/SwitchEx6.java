package ch3;

import java.util.Scanner;

public class SwitchEx6 {
	public static void main(String[] args) {
		// 계산기
		// 사용자에게 두 개의 숫자와 연산자를 입력받기
		// 입력 받은 값에 의해서 계산한 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		// String test = sc.nextLine();
		// nextLine 함수는 문장을 복사(=문자열)하는 개념으로 엔터가 쳐져있는 상태이다
		// 띄어쓰기가 포함된 문장을 표현한다면 nextLine을 사용한다.
		// 현재 코드에선 중간에 문장을 집어넣으면 엔터가 자동 실행되어 다음문장으로 넘어간다
		// 개행문자(자동 줄바꿈)의 차이이다
		
		System.out.println("숫자 입력1");
		int num1 = sc.nextInt();
		System.out.println("숫자 입력2");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력");
		String test = sc.next();
		
		
		int result = 0;
		switch(test) {
		case "+" :
			result = num1 + num2;
			System.out.printf("%d %s %d = %d ", num1, test, num2, result);
			break;
		case "-" :
			result = num1 - num2;
			System.out.printf("%d %s %d = %d ", num1, test, num2, result);
			break;
		case "*" :
			result = num1 * num2;
			System.out.printf("%d %s %d = %d ", num1, test, num2, result);
			break;
		case "/" :
			result = num1 / num2;
			System.out.printf("%d %s %d = %d ", num1, test, num2, result);
			break;
		default :
			System.out.println("오류");
			break;
		}
	}
}