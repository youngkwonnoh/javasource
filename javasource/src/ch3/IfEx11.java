package ch3;

import java.util.Scanner;

public class IfEx11 {
	public static void main(String[] args) {
		// 사용자로부터 3개의 정수를 입력받아 가장 작은 값을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int min = num1;
		
		if(min > num2) {
			min = num2;
		}
		
		if(min > num3) {
			min = num3;
		}
		System.out.println("가장 작은 값 : " + min);
		// System.out.printf("가장 작은 값 : %s", min);
	}
}