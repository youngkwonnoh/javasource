package ch3;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int op1 = sc.nextInt(); // 35 엔터
		
		System.out.print("연산자(+, -, *, /)입력 : ");
		// String str = sc.nextLine();
		String str = sc.next();
		
		// nextLine() 사용 시 앞에 nextInt에서 사용한 엔터를 읽어온다.
		// next()는 공백을 기준으로 읽어서 연산라 부분이 입력 가능하다.
		// 하지만 next()는 공백 기준이기 때문에 띄어쓰기 출력 불가능
		// next() 사용시 '서울 인천'을 입력하면 서울만 입력된다. 
		
		System.out.print("두번째 수 입력 : ");
		int op2 = sc.nextInt();
		
		System.out.printf("%d %s %d", op1, str, op2);
		
	}

}