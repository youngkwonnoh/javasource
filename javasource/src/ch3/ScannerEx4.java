package ch3;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		
		// 문자숫자 "35" > 숫자 35 
		int op1 = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("연산자(+, -, *, /)입력 : ");
		String str = sc.nextLine();
		// String str = sc.next();
		
		System.out.print("두번째 수 입력 : ");
		int op2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d %s %d", op1, str, op2);
		
	}

}