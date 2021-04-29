package ch9;

import java.util.Scanner;

public abstract class Calculator {
	int a, b;
	
	abstract int calc();
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 >>"); //5 3
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	void run() {
		input();
		int result = calc();
		System.out.println("계산된 값 : " + result);
	}
	
}
