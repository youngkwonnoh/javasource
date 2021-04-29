package ch3;

import java.util.Scanner;

public class ForEx10 {
	public static void main(String[] args) {
		// 임의의 정수를 입력받아 해당 수의 Factorial 구하기
		// ex) 4 : 4 * 3 * 2 * 1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
			// fact *= i;
		}
		System.out.println(num + "! = " + fact);
	}

}
