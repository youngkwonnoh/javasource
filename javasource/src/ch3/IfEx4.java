package ch3;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		// 사용자의 이력값이 0인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("입력 값은 0 입니다.");
		} else {
			System.out.println("입력 값은 0이 아닙니다.");
		}
	}

}