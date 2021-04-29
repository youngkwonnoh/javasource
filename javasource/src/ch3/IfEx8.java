package ch3;

import java.util.Scanner;

public class IfEx8 {
	public static void main(String[] args) {
		// 사용자한테 값을 입력받아 홀수, 짝수인지 출력하기 (if ~ else)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}